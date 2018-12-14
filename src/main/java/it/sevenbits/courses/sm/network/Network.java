package it.sevenbits.courses.sm.network;

import it.sevenbits.courses.sm.manager.sm.StateMachineNetworkManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Network implements INetwork {
    private final int maxSize;
    private ConcurrentLinkedDeque<NetworkPackage> packages = new ConcurrentLinkedDeque<NetworkPackage>();
    final static Logger logger = LoggerFactory.getLogger(Network.class);

    public Network(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean hasPackage() {
       return packages.size() > 0;
    }

    @Override
    public NetworkPackage getPackage(){
        // TODO: add debug log
        if (logger.isDebugEnabled()) {
            logger.debug("Package removed");
        }
        return packages.removeFirst();
    }

    @Override
    public void addPackage(String message, String type) {
        if(packages.size() < maxSize) {
            // TODO: add debug log
            packages.addLast(new NetworkPackage(type, message));
            if (logger.isDebugEnabled()) {
                logger.debug("Package added");
            }
        }
        // TODO: add error log
    }
}

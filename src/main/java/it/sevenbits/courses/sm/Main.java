package it.sevenbits.courses.sm;

import it.sevenbits.courses.sm.manager.INetworkManager;
import it.sevenbits.courses.sm.manager.sm.StateMachineNetworkManager;
import it.sevenbits.courses.sm.network.INetwork;
import it.sevenbits.courses.sm.network.Network;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) throws Exception {
//        final INetworkManager nm = new SimpleNetworkManager();
        final INetworkManager nm = new StateMachineNetworkManager();
        final INetwork network = new Network(500);

        PackagesGenerator packagesGenerator = new PackagesGenerator();
        Thread createMessagesThread = packagesGenerator.packagesFillerTaskTwo(nm,network);

        createMessagesThread.start();
        nm.listen(network);
    }
}

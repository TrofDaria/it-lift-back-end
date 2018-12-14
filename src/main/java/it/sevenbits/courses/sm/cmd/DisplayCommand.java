package it.sevenbits.courses.sm.cmd;

import it.sevenbits.courses.sm.manager.NetworkManagerBuffer;
import it.sevenbits.courses.sm.network.NetworkPackage;

public class DisplayCommand implements INetworkManagerCommand {
    @Override
    public void execute(NetworkPackage networkPackage, NetworkManagerBuffer buffer) {
        System.out.println("RECEIVED MESSAGE: "+  buffer.toString());
        buffer.clear();
    }
}

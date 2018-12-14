package it.sevenbits.courses.sm.cmd;

import it.sevenbits.courses.sm.manager.NetworkManagerBuffer;
import it.sevenbits.courses.sm.network.NetworkPackage;

public class AppendCommand implements INetworkManagerCommand {
    @Override
    public void execute(NetworkPackage networkPackage, NetworkManagerBuffer buffer) {
        buffer.add(networkPackage.getMessage());
    }
}

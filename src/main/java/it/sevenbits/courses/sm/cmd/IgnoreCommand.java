package it.sevenbits.courses.sm.cmd;

import it.sevenbits.courses.sm.manager.NetworkManagerBuffer;
import it.sevenbits.courses.sm.network.NetworkPackage;

public class IgnoreCommand implements INetworkManagerCommand {
    @Override
    public void execute(NetworkPackage networkPackage, NetworkManagerBuffer buffer) {
    }
}

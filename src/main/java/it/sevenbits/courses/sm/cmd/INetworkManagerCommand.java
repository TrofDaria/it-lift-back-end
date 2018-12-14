package it.sevenbits.courses.sm.cmd;

import it.sevenbits.courses.sm.manager.NetworkManagerBuffer;
import it.sevenbits.courses.sm.network.NetworkPackage;

public interface INetworkManagerCommand {
    void execute(NetworkPackage networkPackage, NetworkManagerBuffer buffer);
}

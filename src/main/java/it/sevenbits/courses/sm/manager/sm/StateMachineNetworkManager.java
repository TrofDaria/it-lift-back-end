package it.sevenbits.courses.sm.manager.sm;

import it.sevenbits.courses.sm.cmd.CommandCreator;
import it.sevenbits.courses.sm.log.MessageFormatter;
import it.sevenbits.courses.sm.manager.INetworkManager;
import it.sevenbits.courses.sm.manager.NetworkManagerBuffer;
import it.sevenbits.courses.sm.manager.NetworkManagerException;
import it.sevenbits.courses.sm.network.INetwork;
import it.sevenbits.courses.sm.network.NetworkPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StateMachineNetworkManager implements INetworkManager {
    final static Logger logger = LoggerFactory.getLogger(StateMachineNetworkManager.class);

    private boolean isInterrupted = false;
    private final long TIMEOUT = 500;
    private final StateTransition stateTransition;

    public StateMachineNetworkManager() {
        this.stateTransition = new StateTransition();
    }

    @Override
    public void listen(INetwork network) throws NetworkManagerException {
        State currentState = stateTransition.getStartState();
        MessageFormatter msgFormatter = new MessageFormatter();
        CommandCreator commandCreator = new CommandCreator();
        NetworkManagerBuffer buffer = new NetworkManagerBuffer();

        try {
            while (!isInterrupted) {
                while (network.hasPackage()) {
                    NetworkPackage p = network.getPackage();

                    logger.info(String.format(msgFormatter.getStringFormatByType(p.getType()), p.getMessage()));
                    commandCreator.createCommand(p, currentState).execute(p, buffer);
                    currentState = stateTransition.nextState(currentState, p);
                    System.out.println(String.format("%1$s: %2$s", p.getType(), currentState.toString()));

                }

                Thread.sleep(TIMEOUT);
            }
        } catch (InterruptedException e) {
            logger.error("Network manager was interrupted unexpectedly");
            throw new NetworkManagerException("Network manager was interrupted unexpectedly", e);
        }
    }

    @Override
    public void stop() {
        logger.info("Network manager was interrupted");
        isInterrupted = true;
    }
}

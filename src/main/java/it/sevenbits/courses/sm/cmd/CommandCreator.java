package it.sevenbits.courses.sm.cmd;

import it.sevenbits.courses.sm.manager.sm.Pair;
import it.sevenbits.courses.sm.manager.sm.State;
import it.sevenbits.courses.sm.network.NetworkPackage;

import java.util.HashMap;
import java.util.Map;

public class CommandCreator {
    private Map<Pair<String, String>, INetworkManagerCommand> cmpMap;

    public CommandCreator() {
        cmpMap = new HashMap<>();
        cmpMap.put(new Pair<>("MESSAGE", "IGNORE"), new IgnoreCommand());
        cmpMap.put(new Pair<>("TRASH", "IGNORE"), new IgnoreCommand());
        cmpMap.put(new Pair<>("MESSAGE_START", "IGNORE"), new IgnoreCommand());
        cmpMap.put(new Pair<>("MESSAGE_FINISH", "IGNORE"), new IgnoreCommand());

        cmpMap.put(new Pair<>("MESSAGE", "LISTEN"), new AppendCommand());
        cmpMap.put(new Pair<>("TRASH", "LISTEN"), new IgnoreCommand());
        cmpMap.put(new Pair<>("MESSAGE_START", "LISTEN"), new IgnoreCommand());
        cmpMap.put(new Pair<>("MESSAGE_FINISH", "LISTEN"), new DisplayCommand());

        cmpMap.put(new Pair<>("MESSAGE", "TRASH_SUSPICION"), new AppendCommand());
        cmpMap.put(new Pair<>("TRASH", "TRASH_SUSPICION"), new DisplayCommand());
        cmpMap.put(new Pair<>("MESSAGE_START", "TRASH_SUSPICION"), new IgnoreCommand());
        cmpMap.put(new Pair<>("MESSAGE_FINISH", "TRASH_SUSPICION"), new DisplayCommand());

    }
    public INetworkManagerCommand createCommand(NetworkPackage networkPackage, State state){
        return cmpMap.getOrDefault(new Pair<>(networkPackage.getType(), state.toString()), new IgnoreCommand());
    }
}

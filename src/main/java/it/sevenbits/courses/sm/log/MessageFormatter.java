package it.sevenbits.courses.sm.log;

import java.util.HashMap;
import java.util.Map;

// TODO: make Map
public class MessageFormatter {
    private Map<String, String> msgMap;

    public MessageFormatter() {
        msgMap = new HashMap<String, String>();
        msgMap.put("MESSAGE", "Part of message: %1$s");
        msgMap.put("TRASH", "Trash received");
        msgMap.put("MESSAGE_START", "Message creating started");
        msgMap.put("MESSAGE_FINISH", "Message creating finished");
    }

    public String getStringFormatByType(String type) {
        return msgMap.getOrDefault(type, "Unknown package type");
    }
}

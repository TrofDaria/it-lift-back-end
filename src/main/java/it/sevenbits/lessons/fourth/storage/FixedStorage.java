package it.sevenbits.lessons.fourth.storage;


import it.sevenbits.lessons.fourth.Planet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class FixedStorage implements IFixedStorage {
    final static Logger logger = LoggerFactory.getLogger(UniqueStorage.class);
    private Map<String, Planet> map;

    public FixedStorage() {
        map = new HashMap<String, Planet>() {
        };

    }

    public void add(String key, Planet planet) {
        if (contains(planet)) {
            map.replace(key, planet);
            logger.warn("Tried to add item with already existing key - " + key + ", value was changed to " +
                    planet.toString());
            return;
        }
        if (map.size() >= 7) {
            logger.warn("Reached max amount of items, no more can be added");
            return;
        }
        map.put(key, planet);
        logger.info("Item - " + map.get(key).toString() + "  added");
    }

    public boolean remove(String key) {
        if (map.size() == 0) {
            logger.error("Tried to remove item by key - " + key + " from empty storage");
            return false;
        }
        if (!map.containsKey(key)) {
            logger.error("Storage does not contain item with key - " + key);
            return false;
        }
        map.remove(key);
        return true;
    }

    public boolean contains(Planet planet) {
        return map.containsValue(planet);
    }

    public Collection<Planet> all(){
        return map.values();
    }

}

package it.sevenbits.lessons.fourth.storage;

import it.sevenbits.lessons.fourth.Planet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

public class UniqueStorage implements IUniqueStorage {
    final static Logger logger = LoggerFactory.getLogger(UniqueStorage.class);

    private ArrayList<Planet> list = new ArrayList<Planet>();

    public UniqueStorage() {

    }

    public boolean add(Planet planet) {
        if (contains(planet)) {
            logger.warn("Tried to add an existing item: " + planet.toString());
            return false;
        }
        list.add(planet);
        logger.info("Item - " + planet.toString() + " added");
        return true;
    }

    public boolean remove(Planet planet) {
        if (list.size() == 0) {
            logger.error("Tried to remove item from empty storage");
            return false;
        }
        if (list.remove(planet)) {
            logger.info("Item - " + planet.toString() + " removed");
            return true;
        }
        logger.error("Failed to remove item - " + planet.toString());
        return false;
    }

    public boolean contains(Planet planet) {
        for (Object obj : list) {
            if (obj.equals(planet)) {
                return true;
            }
        }
        return false;
    }

    public Collection<Planet> all() {
        return list;
    }
}

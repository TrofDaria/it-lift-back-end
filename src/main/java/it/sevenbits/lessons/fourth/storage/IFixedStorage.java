package it.sevenbits.lessons.fourth.storage;

import it.sevenbits.lessons.fourth.Planet;

public interface IFixedStorage {
    void add(String key, Planet planet);

    boolean remove(String key);

    boolean contains(Planet planet);
}

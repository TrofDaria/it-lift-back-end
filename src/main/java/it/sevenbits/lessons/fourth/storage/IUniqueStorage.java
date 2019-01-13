package it.sevenbits.lessons.fourth.storage;

import it.sevenbits.lessons.fourth.Planet;

public interface IUniqueStorage {

    boolean add(Planet planet);

    boolean remove(Planet planet);

    boolean contains(Planet planet);
}

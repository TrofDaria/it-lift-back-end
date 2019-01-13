package it.sevenbits.lessons.fourth;

import it.sevenbits.lessons.fourth.storage.FixedStorage;
import it.sevenbits.lessons.fourth.storage.UniqueStorage;

import java.util.Collection;

public class Main {
    public static void main(String [] args){
        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet uranus = new Planet("Uranus");

        UniqueStorage uniqueStorage = new UniqueStorage();
        uniqueStorage.add(mercury);
        uniqueStorage.add(venus);
        uniqueStorage.add(earth);
        uniqueStorage.add(mars);
        uniqueStorage.add(jupiter);
        uniqueStorage.add(saturn);
        uniqueStorage.add(uranus);

        FixedStorage fixedStorage = new FixedStorage();
        fixedStorage.add(mercury.getId(), mercury);
        fixedStorage.add(venus.getId(), venus);
        fixedStorage.add(earth.getId(), earth);
        fixedStorage.add(mars.getId(), mars);
        fixedStorage.add(jupiter.getId(), jupiter);
        fixedStorage.add(saturn.getId(), saturn);
        fixedStorage.add(uranus.getId(), uranus);

        Collection<Planet> planets = fixedStorage.all();
        for (Planet planet: planets){
            if(!uniqueStorage.contains(planet)){
                System.out.println("UniqueStorage does not contain item - "+ planet.toString());
            }
        }
    }
}

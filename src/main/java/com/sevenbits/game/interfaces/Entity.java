package com.sevenbits.game.interfaces;

public interface Entity extends Item, Mortal, Damaging, Movable {
    void open(Openable openable);
//    void use(Equipment equipment);
}

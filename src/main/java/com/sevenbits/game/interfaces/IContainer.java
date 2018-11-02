package com.sevenbits.game.interfaces;


import java.util.List;

public interface IContainer extends Item{
    void addItem(Item item);
    Item getFirstItem();
}

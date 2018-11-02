package com.sevenbits.game;

import com.sevenbits.game.interfaces.IContainer;
import com.sevenbits.game.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Container implements IContainer {
    private List<Item> items;

    Container(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getFirstItem() {
        return items.get(0);
    }
}

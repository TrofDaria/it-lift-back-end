package com.sevenbits.game;

import com.sevenbits.game.interfaces.Inventory;
import com.sevenbits.game.interfaces.Item;

class Backpack implements Inventory {
    Container container;
    private boolean isOpen;


    Backpack(){
        isOpen=false;
        container = new Container();
    }
    Backpack(Container container){
        this();
        this.container= container;

    }
    public void open(){
        isOpen=true;
    }
    public void close(){
        isOpen=false;
    }

    @Override
    public Item dropItem() {
        return null;
    }

    @Override
    public void addItem(Item item) {
         container.addItem(item);
    }

    @Override
    public Item getFirstItem() {
            return container.getFirstItem();
    }

    public Container getAllItems() {
            return container;
    }
}

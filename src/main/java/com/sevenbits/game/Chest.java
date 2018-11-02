package com.sevenbits.game;

import com.sevenbits.game.interfaces.IContainer;
import com.sevenbits.game.interfaces.Item;
import com.sevenbits.game.interfaces.Openable;


class Chest implements Openable, IContainer {
    private boolean isOpen;
    private Container container;

    Chest(){
        isOpen=false;
        container = new Container();
    }
    Chest(Container container){
        this.container= container;
        isOpen=false;

    }
    public void open(){
          isOpen=true;
    }
    public void close(){
        isOpen=false;
    }

    @Override
    public void addItem(Item item) {
        if(isOpen){
        container.addItem(item);
        }
    }

    @Override
    public Item getFirstItem() {
        if(isOpen){
        return container.getFirstItem();
        }else return null;
    }

    public Container getAllItems() {
        if(isOpen) {
            return container;
        }else return null;
    }
}

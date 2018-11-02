package com.sevenbits.game;

import com.sevenbits.game.interfaces.Entity;
import com.sevenbits.game.interfaces.Item;
import com.sevenbits.game.interfaces.Mortal;
import com.sevenbits.game.interfaces.Openable;

class Player implements Entity {
    private Backpack backpack;
    private int life;
    private int damagePower;

    Player(){
        backpack= new Backpack();
        life=10;
        damagePower=1;
    }

    @Override
    public void move() {

    }

    public void open(Openable openable){
        openable.open();
    }

    public void addToBackpack(Item item){
        backpack.addItem(item);
    }

    @Override
    public void addLife(int life) {
        this.life+=life;
    }

    @Override
    public void reduceLife(int life) {
        this.life-=life;
    }

    @Override
    public void damage(Mortal mortal) {
        mortal.reduceLife(damagePower);
    }
}

package com.sevenbits.game;

import com.sevenbits.game.interfaces.Item;

import java.util.List;

public class Roguelike {
    public static void main(String[] args){
        Player player = new Player();
        Chest chest = new Chest();
        chest.open();
        chest.addItem(new Sword());
        chest.addItem(new Sword());
        chest.close();

        player.open(chest);

        player.addToBackpack(chest.getFirstItem());
        player.addToBackpack(chest.getFirstItem());


    }
}

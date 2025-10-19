package com.rpg_manager.backend.model;

public class Character_Item {

    private int id_Character;
    private int id_Item;

    public Character_Item() {

    }

    public Character_Item(int id_Item, int id_Character) {
        this.id_Character = id_Character;
        this.id_Item = id_Item;
    }

    public int getId_Character() {
        return id_Character;
    }

    public int getId_Item() {
        return id_Item;
    }

}
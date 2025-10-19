package com.rpg_manager.backend.model;

public class Character_Equipment {

    private int id_Character;
    private int id_Equipment;

    public Character_Equipment() {

    }

    public Character_Equipment(int id_Character, int id_Equipment) {
        this.id_Character = id_Character;
        this.id_Equipment = id_Equipment;
    }

    public int getId_Character() {
        return id_Character;
    }

    public int getId_Equipment() {
        return id_Equipment;
    }

}
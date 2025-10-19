package com.rpg_manager.backend.model;

public class Character_Skill {

    private int id_Character;
    private int id_Skill;

    public Character_Skill() {

    }

    public Character_Skill(int id_Character, int id_Skill) {
        this.id_Character = id_Character;
        this.id_Skill = id_Skill;
    }

    public int getId_Character() {
        return id_Character;
    }

    public int getId_Skill() {
        return id_Skill;
    }

}
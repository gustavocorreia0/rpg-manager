package com.rpg_manager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CharacterAtributes {

    @Id
    private int id_User;

    private int vitality_points;
    private int stamina_points;
    private int mana_points;

    //private int strenght;
    //private int intelligence;
    //private int dexterity;

    public CharacterAtributes() {

    }

    public CharacterAtributes(int vitality_points, int id_User, int stamina_points, int mana_points) {
        this.vitality_points = vitality_points;
        this.id_User = id_User;
        this.stamina_points = stamina_points;
        this.mana_points = mana_points;
    }

    public int getId_User() {
        return id_User;
    }

    public int getVitality_points() {
        return vitality_points;
    }

    public int getStamina_points() {
        return stamina_points;
    }

    public int getMana_points() {
        return mana_points;
    }

    public void setVitality_points(int vitality_points) {
        this.vitality_points = vitality_points;
    }

    public void setStamina_points(int stamina_points) {
        this.stamina_points = stamina_points;
    }

    public void setMana_points(int mana_points) {
        this.mana_points = mana_points;
    }
}

package com.rpg_manager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int stamina_cost;
    private int mana_cost;

    private String name;
    private String description;

    public Skill() {

    }

    public Skill(int id, int stamina_cost, int mana_cost, String name, String description) {
        this.id = id;
        this.stamina_cost = stamina_cost;
        this.mana_cost = mana_cost;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getStamina_cost() {
        return stamina_cost;
    }

    public int getMana_cost() {
        return mana_cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setStamina_cost(int stamina_cost) {
        this.stamina_cost = stamina_cost;
    }

    public void setMana_cost(int mana_cost) {
        this.mana_cost = mana_cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

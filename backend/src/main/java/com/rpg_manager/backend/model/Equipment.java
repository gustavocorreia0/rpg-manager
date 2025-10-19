package com.rpg_manager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String rarity;
    private Float value;

    public Equipment() {
    }

    public Equipment(int id, String name, String description, String rarity, Float value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRarity() {
        return rarity;
    }

    public Float getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setValue(Float value) {
        this.value = value;
    }

}

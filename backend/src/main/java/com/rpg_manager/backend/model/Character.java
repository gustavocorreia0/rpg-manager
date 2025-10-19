package com.rpg_manager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_User;
    private int id_Saga;

    private String name;
    private String type;
    private float money;

    public Character(){
    }

    public Character(int id, int id_User, int id_Saga, String name, String type, float money) {
        this.id = id;
        this.id_User = id_User;
        this.id_Saga = id_Saga;
        this.name = name;
        this.type = type;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public int getId_User() {
        return id_User;
    }

    public int getId_Saga() {
        return id_Saga;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getMoney() {
        return money;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public void setId_Saga(int id_Saga) {
        this.id_Saga = id_Saga;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMoney(float money) {
        this.money = money;
    }

}

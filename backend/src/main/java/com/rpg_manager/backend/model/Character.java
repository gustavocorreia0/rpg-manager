package com.rpg_manager.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_user")
    private int id_User;
    private int id_Saga;
    private String name;
    private String type;
    private float money;

    public Character(){
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

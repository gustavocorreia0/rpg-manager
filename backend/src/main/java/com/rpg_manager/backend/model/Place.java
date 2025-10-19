package com.rpg_manager.backend.model;

import jakarta.persistence.*;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_GameTable;

    private String name;
    private String description;

    public Place() {

    }

    public Place(int id, int id_GameTable, String name, String description) {
        this.id = id;
        this.id_GameTable = id_GameTable;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getId_GameTable() {
        return id_GameTable;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId_GameTable(int id_GameTable) {
        this.id_GameTable = id_GameTable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

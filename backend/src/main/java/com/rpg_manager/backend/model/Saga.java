package com.rpg_manager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_GameTable;

    private String title;
    private String resume;

    public Saga() {

    }

    public Saga(int id, int id_GameTable, String title, String resume) {
        this.id = id;
        this.id_GameTable = id_GameTable;
        this.title = title;
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public int getId_GameTable() {
        return id_GameTable;
    }

    public String getTitle() {
        return title;
    }

    public String getResume() {
        return resume;
    }

    public void setId_GameTable(int id_GameTable) {
        this.id_GameTable = id_GameTable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

}
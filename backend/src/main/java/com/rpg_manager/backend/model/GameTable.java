package com.rpg_manager.backend.model;

import jakarta.persistence.*;

@Entity
public class GameTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_Genre;

    private String name;
    private String description;
    private int id_Master;

}

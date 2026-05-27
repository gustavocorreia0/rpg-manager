package com.rpg_manager.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CharacterDTO {

    @NotBlank(message = "O nome do personagem não deve ser vazio.")
    @Size(min = 1, max = 64, message = "O nome do personagem não pode exceder 64 caracteres")
    private String name;
    private String type;
    private float money;

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

}

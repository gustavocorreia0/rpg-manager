package com.rpg_manager.backend.dto;

import com.rpg_manager.backend.enums.CharacterTypeEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CharacterDTO {

    @NotBlank(message = "O nome do personagem não deve ser vazio.")
    @Size(min = 1, max = 64, message = "O nome do personagem não pode exceder 64 caracteres")
    private String name;

    private CharacterTypeEnum type;

    @NotNull
    private float money;

    @NotNull
    private int id_user;


    public String getName() {
        return this.name;
    }

    public CharacterTypeEnum getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CharacterTypeEnum type) {
        this.type = type;
    }

}

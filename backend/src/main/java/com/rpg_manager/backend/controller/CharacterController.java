package com.rpg_manager.backend.controller;

import com.rpg_manager.backend.dto.CharacterDTO;
import com.rpg_manager.backend.dto.UserDTO;
import com.rpg_manager.backend.model.Character;
import com.rpg_manager.backend.service.CharacterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @PostMapping
    public Character createCharacter(@Valid @RequestBody CharacterDTO characterDTO){
        return characterService.createCharacter(characterDTO);
    }

}

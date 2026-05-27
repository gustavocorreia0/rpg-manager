package com.rpg_manager.backend.service;

import com.rpg_manager.backend.dto.CharacterDTO;
import com.rpg_manager.backend.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rpg_manager.backend.model.Character;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public Character createCharacter(CharacterDTO characterDTO) {
        Character character =  new Character(characterDTO);
        character.setId_User(1);
        return characterRepository.save(character);
    }

}

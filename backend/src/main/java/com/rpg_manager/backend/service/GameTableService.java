package com.rpg_manager.backend.service;

import com.rpg_manager.backend.repository.GameTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameTableService {

    @Autowired
    private GameTableRepository gameTableRepository;

}

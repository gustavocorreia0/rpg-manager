package com.rpg_manager.backend.service;

import com.rpg_manager.backend.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    @Autowired
    public PlaceRepository placeRepository;

}
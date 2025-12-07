package com.rpg_manager.backend.service;

import com.rpg_manager.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService{

    @Autowired
    private ItemRepository itemRepository;

}

package com.rpg_manager.backend.service;

import com.rpg_manager.backend.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

}

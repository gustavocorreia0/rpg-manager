package com.rpg_manager.backend.repository;

import com.rpg_manager.backend.model.CharacterAtributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SagaRepository extends JpaRepository<CharacterAtributes, Integer> {
}

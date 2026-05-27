package com.rpg_manager.backend.repository;

import com.rpg_manager.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);

    public User findByEmail(String email);

}

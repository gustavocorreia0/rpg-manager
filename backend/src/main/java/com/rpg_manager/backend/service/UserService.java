package com.rpg_manager.backend.service;

import com.rpg_manager.backend.exception.UserAlreadyExistsException;
import com.rpg_manager.backend.model.User;
import com.rpg_manager.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário desconhecido"));
    }

    public User createUser(User user) {
        if ((userRepository.findByUsername(user.getUsername()) != null) || (userRepository.findByEmail(user.getEmail()) != null)) {
            throw new UserAlreadyExistsException();
        }
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
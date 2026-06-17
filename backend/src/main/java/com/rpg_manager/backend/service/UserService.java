package com.rpg_manager.backend.service;

import com.rpg_manager.backend.dto.UserDTO;
import com.rpg_manager.backend.dto.UserResponseDTO;
import com.rpg_manager.backend.enums.UserTypeEnum;
import com.rpg_manager.backend.exception.UserAlreadyExistsException;
import com.rpg_manager.backend.exception.UserNotFoundException;
import com.rpg_manager.backend.model.User;
import com.rpg_manager.backend.repository.UserRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO findById(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return new UserResponseDTO(user);
    }

    public UserResponseDTO findByUsername(String username) {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("username", username));
        return new UserResponseDTO(user);
    }

    public UserResponseDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("email", email));
        return new UserResponseDTO(user);
    }

    public UserResponseDTO createUser(@NonNull UserDTO user) {
        User newUserEntity = createUserEntity(user);
        User userSaved = userRepository.save(newUserEntity);
        return new UserResponseDTO(userSaved);
    }

    public List<UserResponseDTO> findAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserResponseDTO> usersDto = new ArrayList<>();
        for(User user : users) {
            usersDto.add(new UserResponseDTO(user));
        }
        return usersDto;
    }

    public User createUserEntity(UserDTO userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setBirthday(userDto.getBirthday());
        user.setType(UserTypeEnum.JOGADOR);

        if (userRepository.existsByUsername(user.getUsername())) {
            throw new UserAlreadyExistsException(user.getUsername());
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserAlreadyExistsException(user.getEmail());
        }

        return user;

    }

}
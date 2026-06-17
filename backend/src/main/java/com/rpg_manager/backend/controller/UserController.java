package com.rpg_manager.backend.controller;

import com.rpg_manager.backend.dto.UserDTO;
import com.rpg_manager.backend.dto.UserResponseDTO;
import com.rpg_manager.backend.exception.UserAlreadyExistsException;
import com.rpg_manager.backend.exception.UserNotFoundException;
import com.rpg_manager.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserResponseDTO> listAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public UserResponseDTO findUserById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @GetMapping("/username/{username}")
    public UserResponseDTO findUserByUsername(@PathVariable("username") String username){
        return userService.findByUsername(username);
    }

    @GetMapping("/search")
    public UserResponseDTO findUserByEmail(@RequestParam String email){
        return userService.findByEmail(email);
    }

    @PostMapping
    public UserResponseDTO createUser(@Valid @RequestBody UserDTO newUser){
        return userService.createUser(newUser);
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<String> userRequestBadRequestHandler(RuntimeException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> userRequestNotFoundHandler(RuntimeException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

}

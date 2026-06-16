package com.rpg_manager.backend.controller;

import com.rpg_manager.backend.dto.UserDTO;
import com.rpg_manager.backend.exception.UserAlreadyExistsException;
import com.rpg_manager.backend.model.User;
import com.rpg_manager.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @GetMapping("/username/{username}")
    public User findUserByUsername(@PathVariable("username") String username){
        return userService.findByUsername(username);
    }

    @GetMapping("/search")
    public User findUserByEmail(@RequestParam String email){
        return userService.findByEmail(email);
    }

    @PostMapping
    public User createUser(@Valid @RequestBody UserDTO newUser){
        User newUserEntity = new User(newUser);
        return userService.createUser(newUserEntity);
    }


    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<String> userExceptionsHandler(UserAlreadyExistsException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}

package com.rpg_manager.backend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Integer id) {
        super("User not found with id: " + id);
    }

    public UserNotFoundException(String field, String value) {
        super("User with " + field + " (" + value + ") not found.");
    }

}
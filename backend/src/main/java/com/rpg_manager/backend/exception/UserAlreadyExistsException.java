package com.rpg_manager.backend.exception;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException() {
        super("Usuário já existe.");
    }

}

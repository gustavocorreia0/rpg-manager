package com.rpg_manager.backend.exception;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException(String user) {
        super("Usuário já existente: " + user);
    }

}

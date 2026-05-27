package com.rpg_manager.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class UserDTO {

    @NotBlank(message = "Nome de usuário não pode ser vazio")
    @Size(min = 1, max = 64, message = "Tamanho do username não pode exceder 64 caracteres")
    private String username;
    @NotBlank(message = "E-mail não pode ser vazio")
    @Email(message = "E-mail deve ser válido")
    private String email;
    @NotBlank(message = "A senha não deve ser vazia")
    @Size(min = 1, max = 64, message = "Tamanho da senha não pode exceder 64 caracteres")
    private String password;
    private Date birthday;


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

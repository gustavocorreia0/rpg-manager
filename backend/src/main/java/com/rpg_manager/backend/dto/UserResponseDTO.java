package com.rpg_manager.backend.dto;

import com.rpg_manager.backend.model.User;

import java.util.Date;

public class UserResponseDTO {

    private String username;
    private String email;
    private Date birthday;

    public UserResponseDTO(User user){
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.birthday = user.getBirthday();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

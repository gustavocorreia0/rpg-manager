package com.rpg_manager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private String password;
    private String type;
    private Date birthday;
    private byte[] img_profile;

    public User(){
    }

    public User(int id, String username, String email, String password, String type, Date birthday, byte[] img_profile) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.type = type;
        this.birthday = birthday;
        this.img_profile = img_profile;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Object getImg_profile() {
        return img_profile;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setImg_profile(byte[] img_profile) {
        this.img_profile = img_profile;
    }
}

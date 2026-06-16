package com.rpg_manager.backend.model;

import com.rpg_manager.backend.dto.UserDTO;
import com.rpg_manager.backend.enums.UserTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserTypeEnum type;

    private Date birthday;

    private byte[] img_profile;


    public User(){
    }

    public User(String username, String email, String password, Date birthday) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
    }

    public User(int id, String username, String email, String password, UserTypeEnum type, Date birthday, byte[] img_profile) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.type = type;
        this.birthday = birthday;
        this.img_profile = img_profile;
    }

    // Construtor com type setado fixo
    public User(UserDTO userDTO){
        this.username = userDTO.getUsername();
        this.email = userDTO.getEmail();
        this.password = userDTO.getPassword();
        this.birthday = userDTO.getBirthday();
        this.type = UserTypeEnum.JOGADOR;
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

    public UserTypeEnum getType() {
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

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setImg_profile(byte[] img_profile) {
        this.img_profile = img_profile;
    }
}

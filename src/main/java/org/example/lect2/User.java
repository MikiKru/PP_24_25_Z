package org.example.lect2;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {
    private String login;
    private String password;
    private LocalDateTime registrationDateTime;
    // ALT + Ins -> generator
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.registrationDateTime = LocalDateTime.now();
    }

    public String encodePassword(String password){
        String starPassword = "";
        for (int i = 0; i < password.length(); i ++)
            starPassword = starPassword + "*";
        return starPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + encodePassword(password) + '\'' +
                ", registrationDateTime=" + registrationDateTime +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
}

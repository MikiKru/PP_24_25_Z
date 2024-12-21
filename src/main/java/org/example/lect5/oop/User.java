package org.example.lect5.oop;

import java.time.LocalDateTime;

public class User {
    private static int idStatic;
    private int userId;
    private final String code = "001";
    private String login;
    private String password;
    private LocalDateTime registrationDateTime;
    private boolean isConfirmed;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.registrationDateTime = LocalDateTime.now();
        this.userId = ++idStatic;
//        code = "002";
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registrationDateTime=" + registrationDateTime +
                ", isConfirmed=" + isConfirmed +
                '}';
    }

    // do pobierania
    public String getLogin() {
        return login;
    }
    // do edycji
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

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
}

package org.example.lect4.example;

import java.util.HashSet;
import java.util.Set;

public class User {
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("adam", "x");
        User user2 = new User("jan", "y");
        User user3 = new User("adam", "x");

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user1);

        System.out.println(users);


    }
}

package org.example.lect5.oop;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("A","aaa");
        User user2 = new User("B","aaa");
        User user3 = new User("C","aaa");
        User user4 = new User("D","aaa");
        User user5 = new User("E","aaa");
        // Zabraniamy na modyfikacje bezposrednio pol klasowych
//        user.login = "abc123";
//        System.out.println(user.login);
        // do modyfikacji korzystamy z metod dostepowych
//        user.setLogin("abc123");
//        System.out.println(user.getLogin());

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
    }
}

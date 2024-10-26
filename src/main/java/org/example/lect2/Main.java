package org.example.lect2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        User user1 = new User();
//        System.out.println(user1);
//        System.out.println(user1.login);
//        System.out.println(user1.password);
//        System.out.println(user1.registrationDateTime);
        User user2 = new User("abc", "abc123!");
        // wyświetlanie
        System.out.println(user2.getLogin());
        System.out.println(user2.getPassword());
        System.out.println(user2.getRegistrationDateTime());
        // edycja
        user2.setPassword("nowe!!!");
        System.out.println(user2.getPassword());
        // reprezentacja obiektu
        User user3 = new User("A", "A");
        System.out.println(user2);
        System.out.println(user3);
        // obiekt od wprowadzania danych z konsoli
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Wprowadź hasło: ");
            User genUser = new User("user"+i, scanner.nextLine());
            System.out.println(genUser);
        }
        scanner.close();
    }
}

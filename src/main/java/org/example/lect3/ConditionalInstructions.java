package org.example.lect3;

import java.util.Scanner;

// CTRL + ALT + L - auto-formatowanie
public class ConditionalInstructions {
    public static void main(String[] args) {
//        boolean inLoop = true;
//        MENU_LOOP: while (inLoop){
        MENU_LOOP: while (true){
            System.out.println("Wybierz zadanie: ");
            System.out.println("1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("Q. Wyjście");
            Scanner scanner = new Scanner(System.in);
            String ex = scanner.nextLine();
            switch (ex) {
                case "1":
                    System.out.println("Wczytano zadanie 1");
                    System.out.println("Podaj swoje imię");
                    String name = scanner.nextLine();
                    System.out.println("Wczytano: " + name);
                    // czy wczytanie imię kończy się na a
                    if (name.toLowerCase().charAt(name.length() - 1) == 'a') {
                        System.out.println("Jesteś kobietą, bo Twoje imię kończy się na 'a'");
                    } else {
                        System.out.println("Jesteś meżczyzną, bo Twoje imię nie kończy się na 'a'");
                    }
                    break;
                case "2":
                    System.out.println("Wczytano zadanie 2");
                    break;
                case "Q":
                case "q":
                    System.out.println("Wyjście");
//                    inLoop = false;
                    break MENU_LOOP;
                default:
                    System.out.println("Błędny wybór");
            }
        }
    }
}

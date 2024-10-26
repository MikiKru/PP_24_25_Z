package org.example.lect2;

import java.util.Arrays;

// psvm -> public static void main(String[] args)
public class StringEx {
    public static void main(String[] args) {
        String name = "Michał";
//        name[0] = "R";    -> Nie możemy edytować stronga!
        name = "Andrzej";
        name = name + "ek";
//        System.out.println("Twoje imię to: " + name);
        System.out.println(name);
    // Metody klasy String
        System.out.println(name.indexOf('M'));
        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf('a'));
        for (int i = 0; i <= name.length() - 1; i++ ) { // metoda length zwraca długość napisu
            System.out.println(name.charAt(i)); // metoda zwracająca znak na określonym indeksie
        }
//        System.out.println(name.charAt(10));
        System.out.println(name.substring(0,7));
        System.out.println(name.replaceAll("e","eee"));
        String input = "  Michał ";
        input = input.trim();
        System.out.println(input);

        String textOne = "Ala";         // String pool   addr: 1
        String textTwo = new String("Ala");
        String textThree = "ala";       //               addr: 2

        System.out.println("Porównywanie napisu: " + (textOne.equals(textTwo)));
        System.out.println("Porównywanie napisu: " + (textOne.toUpperCase().equals(textThree.toUpperCase())));
//        System.out.println("Porównywanie lokalizacji w pamięci: " + (textOne == textTwo));
//        System.out.println("Porównywanie lokalizacji w pamięci: " + (textOne == textThree));

        String csv = "name; lastname; date; status";
//      pętla
        Arrays.stream(csv.split("; ")).forEach(s -> System.out.println(s));
//      pętla
        for (String element : csv.split("; ")){
            System.out.println(element);
        }


    }
}

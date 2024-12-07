package org.example.lect4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // pusta lista
        List<String> players = new ArrayList<>();
        players.add("Adam");
        players.add("Jan");
        players.add("Janusz");

        players.set(1, "Ania");
        System.out.println("Indeks 0: " + players.get(0));
        System.out.println("Rozmiar listy: " + players.size());


        System.out.println(players);

        for (String name : players){
            System.out.println(name);
        }

    }
}

package org.example.lect4;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> arabToRoman = new HashMap<>();

        arabToRoman.put(1, "I");
        arabToRoman.put(2, "II");
        arabToRoman.put(3, "III");
        arabToRoman.put(4, "IV");
        arabToRoman.put(5, "V");
        arabToRoman.put(6, "VI");


        System.out.println(arabToRoman);

        System.out.println("5 rzymska to: " + arabToRoman.get(5));

        for (int arab : arabToRoman.keySet()){
            System.out.println(arab + " : " + arabToRoman.get(arab));
        }

    }
}

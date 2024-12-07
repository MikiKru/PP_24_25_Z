package org.example.lect4;

import java.util.*;

public class Multiarrays {
    public static void main(String[] args) {
        List<Set> external = new ArrayList<>();

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,3,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(10,20,30, 45));
        Set<Integer> s3 = new HashSet<>(Arrays.asList(100,200,300, 444, 555, 666));

        external.add(s1);
        external.add(s2);
        external.add(s3);

        System.out.println(external);
        // sprawdź czy w zbiorze ostatnim jest liczba 300?
        System.out.println(external.get(external.size() - 1).contains(300));

    }
}

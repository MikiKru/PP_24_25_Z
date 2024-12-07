package org.example.lect4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsOperations {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> B = new HashSet<>(Arrays.asList(3,4,5,7,9));

//        A.addAll(B);
//        System.out.println(A);
        A.removeAll(B);
        System.out.println(A);

    }
}

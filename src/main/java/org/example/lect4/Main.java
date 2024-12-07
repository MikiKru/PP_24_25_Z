package org.example.lect4;

import java.util.Random;

public class Main {
    // kolekcje są indeksowane od 0
    String [] names = {"Ala", "Adam"};

    public static int [] createArray(){
        Random random = new Random();
        int range = random.nextInt(10) + 1; // od 1 do 10
        // deklaracja tablicy
//        int myArray [] = {1,2,3};
        int myArray [] = new int[range];

        for (int i = 0; i < range; i++) {
            myArray[i] = random.nextInt(100);
        }
        return myArray;
    }
    public static void printArray(int [] intArray){
        for (int element : intArray){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // generuj
        printArray(createArray());
    }

}

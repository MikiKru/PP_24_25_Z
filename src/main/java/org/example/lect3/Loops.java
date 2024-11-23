package org.example.lect3;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Kolejne kwadraty liczb parzystych od 0 do 100");
        for (int i = 0; i < 101; i = i + 2) {
            System.out.print((int) Math.pow(i,2) + " ");
        }
        System.out.println();
        for (int i = 0; i < 101; i++) {
            if(i % 2 == 0) {
                System.out.print((int) Math.pow(i, 2) + " ");
            }
        }
        System.out.println();
        String name = "Magdalena";
        char szukane = 'x';
        int licznik = 0;
        for (char znak : name.toLowerCase().toCharArray()) {
            if(znak == szukane){
                licznik++;
            }
        }
        System.out.println("Znak " + szukane + " występuje w napisie " + name + " " + licznik + " razy");
    }
}

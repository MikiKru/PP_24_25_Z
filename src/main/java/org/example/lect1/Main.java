package org.example.lect1;


public class Main {
    // sout         ->  System.out.println();
    // ALT + Enter  -> rozwiązywanie problemów
    // CTRL + /     -> komentowanie/odkomentowanie

    static String name;
    String nameTwo;     // name_two - snake case
    int zmienna1;
    public static void main(String[] args) {
        int number = 1;
        double capacity = 3.221;
        char newLine = '\n';
        char characterA = 'A';
        boolean decision = true;

        System.out.println("2^3=" + Math.pow(2,3));
//        System.out.println("Hello world!");
        System.out.println("Twój znak to: " + newLine + characterA);
        System.out.println("Twój znak to: " + characterA);
        System.out.println(number + capacity);
        // 3 arg -> warunek ? gdy prawda to... : gdy nieprawda to...
        decision = false;
        System.out.println(decision ? "prawda" : "fałsz");
        name = "Michał";
        System.out.println(name);

        Main main = new Main();     // nowy obiekt
        main.nameTwo = "zmiana";
        System.out.println(main.nameTwo);
//        final double constNumber = 2.333;     // stała
//        constNumber = 1.2;                    // nie można modyfikować!

        for (int i = 0; i < 10; i++){
            System.out.println("Kolejna iteracja: " + (i +1));
        }

        System.out.println(number == 2);
        System.out.println(false & true);
        // jaka jest różnica między && (- break) a & (dla or || lub |)

        double i = 1;
        int j = 1;

        System.out.println((int) i);
        System.out.println((double) j);
        System.out.println(i * j);
    }

}

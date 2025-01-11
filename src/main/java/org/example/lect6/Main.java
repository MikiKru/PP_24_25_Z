package org.example.lect6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("X","Y",Category.ACTION, 100);
        Book b2 = new Book("X1","Y1",Category.EDUCATIONAL, 300);
        Book b3 = new Book("X2","Y2",Category.SCI_FI, 200);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // skąd te metody
        System.out.println(b1.hashCode());
        System.out.println(b1.equals(b2));

        Article a1 = new Article("A1", "A1", Category.SCI_FI, 100, "DSAD2323213123DA");
        System.out.println(a1);
        System.out.println(a1.getAuthor());
        System.out.println(a1.equals(b1));

        // polimorfizm
        // definiowanie obiektu klasą nadrzędną
        Book o1 = new Book();
        System.out.println(o1.getClass().getName());
        Book o2 = new Article();
        System.out.println(o2.getClass().getName());
        Object o = new Article();
        ((Article) o).getTitle();
        System.out.println(o.getClass().getName());

        List<String> names = new ArrayList<>();
        List<String> cats = new LinkedList<>();

        // przeciążanie
        System.out.println(b1.convertNetToGross());
        System.out.println(b1.convertNetToGross(8));

    }
}

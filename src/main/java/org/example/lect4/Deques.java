package org.example.lect4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Deques {
    public static void main(String[] args) {
        Deque<String> messages = new ArrayDeque<>();

        messages.addLast("M1");
        messages.addLast("M2");
        messages.addLast("M3");
        messages.addLast("M4");

        System.out.println(messages.removeFirst());
        System.out.println(messages.removeFirst());
        System.out.println(messages.removeFirst());

        System.out.println(messages);

    }
}

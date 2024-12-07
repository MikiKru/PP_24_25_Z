package org.example.lect4;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MODERATOR");
        roles.add("MODERATOR");

        roles.remove("ADMIN");

        System.out.println(roles);
    }
}

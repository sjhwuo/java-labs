package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sportsman> team = new ArrayList<>();

        team.add(new Forward("Алексей", "Орлы", 9, 10, 5));
        team.add(new Forward("Илья", "Орлы", 11, 7, 3));

        team.add(new Defender("Максим", "Орлы", 2, 20, 10));
        team.add(new Defender("Даниил", "Орлы", 4, 15, 8));
        team.add(new Defender("Артём", "Орлы", 5, 18, 6));

        for (Sportsman sportsman : team) {
            sportsman.displayInfo();
            System.out.println();
        }


    }
}
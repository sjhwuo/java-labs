package org.example;

public class Main {
    public static void main(String[] args) {
        Installable[] programs = {
                new Game("Minecraft", "1.0", "Песочница"),
                new Game("The Sims", "1.0", "Симулятор"),
                new Game("Cyberpunk 2077", "1.0", "RPG"),
                new Editor("Photoshop", "1.0", "PSD"),
                new Editor("Visual Studio Code", "1.0", "TXT")
        };

        System.out.println("установка");

        for (Installable program : programs) {
            program.install();
        }

        System.out.println("\n обновление ");

        for (Installable program : programs) {
            Updatable updatable = (Updatable) program;
            updatable.update();
            System.out.println("Версия: " + updatable.getVersion());
        }

        System.out.println("\n инфо");

        for (Installable program : programs) {
            System.out.println(program);
        }
    }
}
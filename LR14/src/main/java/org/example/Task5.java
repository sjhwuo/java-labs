package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        Random rnd = new Random();

        // Создание файла с 10 числами
        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 10; i++) {
                pw.print((rnd.nextInt(201) - 50) + " "); // от -50 до 150
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // Чтение и подсчет
        int count = 0;
        try (Scanner sc = new Scanner(f)) {
            System.out.println("Числа в файле:");
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                System.out.print(n + " ");
                if (n > 75) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
            return;
        }
        System.out.println("\nКоличество чисел больше 75: " + count);
    }
}
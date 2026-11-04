package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random rnd = new Random();

        // Создание файла f со случайными числами
        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 30; i++) {
                pw.print((rnd.nextInt(2001) - 1000) + " "); // от -1000 до 1000
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи f: " + e.getMessage());
            return;
        }

        // Распределение чисел по файлам g и h
        try (Scanner sc = new Scanner(f);
             PrintWriter pg = new PrintWriter(new FileWriter(g));
             PrintWriter ph = new PrintWriter(new FileWriter(h))) {
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n % 5 == 0 && n % 7 == 0) {
                    pg.print(n + " ");
                } else {
                    ph.print(n + " ");
                }
            }
            System.out.println("Готово. Результаты в файлах g.txt и h.txt");
        } catch (IOException e) {
            System.err.println("Ошибка обработки: " + e.getMessage());
        }
    }
}
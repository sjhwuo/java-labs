package org.example;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        Scanner sc = new Scanner(System.in);

        // Ввод с клавиатуры и запись в файл
        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                pw.println(sc.nextInt());
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // Чтение из файла
        int count = 0;
        try (Scanner fileScanner = new Scanner(f)) {
            System.out.println("Числа из файла:");
            while (fileScanner.hasNextInt()) {
                int n = fileScanner.nextInt();
                System.out.print(n + " ");
                if (n % 2 == 0 || n % 3 == 0) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
            return;
        }
        System.out.println("\nКоличество чисел, кратных 2 или 3: " + count);
    }
}
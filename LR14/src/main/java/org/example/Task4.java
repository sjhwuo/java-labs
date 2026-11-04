package org.example;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File f = new File("radiation.txt");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // дробные через точку

        // Ввод 15 вещественных значений и запись в файл
        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            System.out.println("Введите 15 значений уровня радиации (мкЗв/ч):");
            for (int i = 0; i < 15; i++) {
                pw.println(sc.nextDouble());
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // Чтение и вычисление среднего
        double sum = 0;
        int count = 0;
        try (Scanner fs = new Scanner(f).useLocale(Locale.US)) {
            while (fs.hasNextDouble()) {
                sum += fs.nextDouble();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.printf(Locale.US, "Средний уровень радиации: %.3f мкЗв/ч%n", sum / count);
        } else {
            System.out.println("В файле нет данных.");
        }
    }
}
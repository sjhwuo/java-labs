package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("plant.txt");

        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
            bw.write("Мое любимое растение - орхидея (фаленопсис).");
            bw.newLine();
            bw.write("Семейство: Орхидные. Родина: Юго-Восточная Азия.");
            bw.newLine();
            bw.write("Цветет несколько месяцев, любит рассеянный свет и умеренный полив.");
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // Данные о файле
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Последнее изменение: " + new Date(file.lastModified()));
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно писать: " + file.canWrite());
        System.out.println("Это каталог: " + file.isDirectory());


        // Чтение содержимого
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
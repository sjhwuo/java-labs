package org.example;

public class Main {
    static void main(String[] args) {
        Instrument instrument = new Instrument(
                "Музыкальный инструмент", "Общий", "Разный","ппроп");
        Guitar guitar = new Guitar("Гитара", "Струнный", "Мелодичный", 6);
        Piano piano = new Piano("Пианино", "Клавишный", "Мягкий", 88);

        System.out.println("Перегрузка методов (статический полиморфизм) ");
        instrument.play();
        instrument.play(7);
        instrument.play("Вечерняя мелодия");
        guitar.play();
        guitar.play(9);
        guitar.play("Рок", 9);
        piano.play();
        piano.play(5);
        piano.play("Вальс", true);

        System.out.println();
        System.out.println("=== Переопределение методов (динамический полиморфизм) ");
        Instrument[] instruments = {instrument, guitar, piano};
        for (Instrument item : instruments) {
            System.out.println(item.getName() + " — " + item.getSoundType());
        }

        System.out.println();
        System.out.println("Информация об инструментах ");
        for (Instrument item : instruments) {
            item.showInfo();
            System.out.println();
        }

        System.out.println("Проверка instanceof ");
        for (Instrument item : instruments) {
            if (item instanceof Guitar) {
                System.out.println(item.getName() + " — это гитара.");
            } else if (item instanceof Piano) {
                System.out.println(item.getName() + " — это пианино.");
            } else {
                System.out.println(item.getName() + " — базовый инструмент.");
            }
        }
    }
}

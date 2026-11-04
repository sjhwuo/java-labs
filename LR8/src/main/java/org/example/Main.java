package org.example;

public class Main {
    public static void main(String[] args) {
        Dishware[] dishes = {
                new Plate("Обеденная тарелка", 500, "Белый", 25),
                new Plate("Десертная тарелка", 300, "Синий", 20),
                new Plate("Суповая тарелка", 700, "Зеленый", 22),
                new Cup("Чайная чашка", 250, "Красный", true),
                new Cup("Кофейная чашка", 150, "Черный", true)
        };

        for (Dishware dish : dishes) {
            System.out.println(dish);
            dish.use();

            if (dish instanceof Plate) {
                ((Plate) dish).stack();
            } else if (dish instanceof Cup) {
                ((Cup) dish).fill();
            }

            System.out.println();
        }
    }
}
package LR12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LR12 {
    public static void printCoaches(List<Coach> coaches, int level) {
        for (Coach coach : coaches) {
            if (coach.getLevel() == level) {
                System.out.println(coach);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Dish> dishes = new HashMap<>();

        dishes.put("Тарелка обеденная",
                new Plate("Тарелка обеденная", 1, 0.5, 26));
        dishes.put("Тарелка десертная",
                new Plate("Тарелка десертная", 2, 0.3, 19));
        dishes.put("Тарелка глубокая",
                new Plate("Тарелка глубокая", 3, 0.7, 22));
        dishes.put("Чашка чайная",
                new Cup("Чашка чайная", 4, 0.25, true));
        dishes.put("Кружка",
                new Cup("Кружка", 5, 0.4, true));
        dishes.put("Чашка без ручки",
                new Cup("Чашка без ручки", 6, 0.2, false));
        dishes.put("Миска салатная",
                new Bowl("Миска салатная", 7, 1.2, 8));
        dishes.put("Миска суповая",
                new Bowl("Миска суповая", 8, 0.8, 6));

        System.out.println("ПОСУДА");

        for (Map.Entry<String, Dish> entry : dishes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        List<Coach> coaches = new ArrayList<>();

        coaches.add(new Coach(1, "Анна", "Плавание", 1,
                List.of(4, 5, 4)));
        coaches.add(new Coach(2, "Борис", "Футбол", 2,
                List.of(3, 3, 4)));
        coaches.add(new Coach(3, "Виктор", "Теннис", 2,
                List.of(5, 4, 5)));
        coaches.add(new Coach(4, "Дарья", "Волейбол", 1,
                List.of(2, 3, 3)));
        coaches.add(new Coach(5, "Егор", "Баскетбол", 3,
                List.of(4, 4, 5)));

        System.out.println("\nТРЕНЕРЫ СО СРЕДНИМ РЕЙТИНГОМ БОЛЬШЕ 3");

        for (Coach coach : coaches) {
            if (coach.getAverageRating() > 3) {
                System.out.println(coach);
            }
        }

        for (Coach coach : coaches) {
            if (coach.getAverageRating() >= 4) {
                coach.setLevel(coach.getLevel() + 1);
            }
        }

        System.out.println("\nТРЕНЕРЫ ПОСЛЕ ПОВЫШЕНИЯ УРОВНЯ");

        for (Coach coach : coaches) {
            System.out.println(coach);
        }

        System.out.println("\nТРЕНЕРЫ УРОВНЯ 2");
        printCoaches(coaches, 2);

        Collections.sort(coaches, new Comparator<Coach>() {
            @Override
            public int compare(Coach first, Coach second) {
                int result = Double.compare(
                        second.getAverageRating(),
                        first.getAverageRating());

                if (result == 0) {
                    return first.getName().compareTo(second.getName());
                }

                return result;
            }
        });

        System.out.println("\nСОРТИРОВКА ТРЕНЕРОВ");

        for (Coach coach : coaches) {
            System.out.println("ID=" + coach.getId()
                    + ", имя=" + coach.getName()
                    + ", средний рейтинг="
                    + String.format("%.2f", coach.getAverageRating()));
        }
    }
}
package org.example;

public class Restaurant {
    String name;
    String cuisine;
    int rating;

    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public boolean isPopular() {
        return rating > 4;
    }

 @Override
    public String toString() {
        return  "Имя: " + name + " Кухня: " + cuisine + " Рейтинг:" + rating;
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Bella", "Итальянская", 5);

        System.out.println("Название: " + restaurant.name);
        System.out.println("Кухня: " + restaurant.cuisine);
        System.out.println("Рейтинг: " + restaurant.rating);
        System.out.println("Популярный: " + restaurant.isPopular());
        System.out.println(restaurant);
    }
}
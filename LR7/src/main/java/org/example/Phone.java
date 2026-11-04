package org.example;

class Phone {
    private String brand;
    private double price;
    private int battery;

    static int totalPhones = 0;
    static double totalPrice = 0;

    public Phone(String brand, double price, int battery) {
        this.brand = brand;
        this.price = price;
        this.battery = battery;

        totalPhones++;
        totalPrice += price;
    }
    public void printInfo() {
        System.out.println("Бренд:" + brand + "Цена:" + price + "Батарея:" + battery + "Всего телефонов" + totalPhones + "Общая цена" + totalPrice );
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getBattery() {
        return battery;
    }

    public static double getAveragePrice() {
        return totalPrice / totalPhones;
    }


}


class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", 1000, 20);
        Phone phone2 = new Phone("Apple", 1200, 18);
        Phone phone3 = new Phone("Xiaomi", 500, 22);
        Phone phone4 = new Phone("Huawei", 700, 21);
        Phone phone5 = new Phone("Honor", 600, 20);
        Phone phone6 = new Phone("Google", 900, 19);

        System.out.println("Количество телефонов: " + Phone.totalPhones);
        System.out.println("Общая цена: " + Phone.totalPrice);
        System.out.println("Средняя цена: " + Phone.getAveragePrice());

    }

}
package org.example;

enum SubscriptionType {
    FREE,
    PREMIUM,
    VIP
}

class User {
    String username;
    SubscriptionType subscription;

    public User(String username, SubscriptionType subscription) {
        this.username = username;
        this.subscription = subscription;
    }
}

public class Subscription {
    public static void main(String[] args) {
        User[] users = {
                new User("Анна", SubscriptionType.FREE),
                new User("Иван", SubscriptionType.VIP),
                new User("Олег", SubscriptionType.PREMIUM),
                new User("Мария", SubscriptionType.VIP),
                new User("Елена", SubscriptionType.FREE)
        };

        System.out.println("Пользователи с подпиской VIP:");

        for (User user : users) {
            if (user.subscription == SubscriptionType.VIP) {
                System.out.println(user.username);
            }
        }
    }
}
package org.example;
public class Game implements Installable, Updatable {
    private final String name;
    private String version;
    private final String genre;
    private boolean installed;

    public Game(String name, String version, String genre) {
        this.name = name;
        this.version = version;
        this.genre = genre;
        installed = false;
    }

    @Override
    public void install() {
        installed = true;
        System.out.println("Игра " + name + " установлена");
    }

    @Override
    public void uninstall() {
        installed = false;
        System.out.println("Игра " + name + " удалена");
    }

    @Override
    public void update() {
        version = "2.0";
        System.out.println("Игра " + name + " обновлена");
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Игра: " + name + ", жанр: " + genre
                + ", версия: " + version
                + ", установлена: " + installed;
    }
}
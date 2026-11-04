package org.example;
public class Editor implements Installable, Updatable{
    private final String name;
    private String version;
    private final String format;
    private boolean installed;

    public Editor(String name, String version, String format) {
        this.name = name;
        this.version = version;
        this.format = format;
        installed = false;
    }
 @Override
 public void ozenka (){
        System.out.println(" хз мне понрав ");;
 }
    @Override
    public void install() {
        installed = true;
        System.out.println("Редактор " + name + " установлен");
    }

    @Override
    public void uninstall() {
        installed = false;
        System.out.println("Редактор " + name + " удален");
    }

    @Override
    public void update() {
        version = "2.0";
        System.out.println("Редактор " + name + " обновлен");
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Редактор: " + name + ", формат: " + format
                + ", версия: " + version
                + ", установлен: " + installed;
    }
}
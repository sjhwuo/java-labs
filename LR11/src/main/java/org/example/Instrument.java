package org.example;

public class Instrument {
    private final String name;
    private final String type;
    private String sound;
    private String zvuk;

    public Instrument(String name, String type, String sound, String zvuk) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.zvuk = zvuk;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public String getSound() { return sound; }

    public void play() {
        System.out.println(name + ": Играю");
    }

    public void play (String zvuk) {
        System.out.println( name + " НЕ ИГРАЕТ С ГРОМКОГСТЬЮ "  );
    }
    public void play(int volume) {
        System.out.println(name + ": Играю громкостью " + volume);
    }

    public void play(String melody) {
        System.out.println(name + ": Играю мелодию " + melody);
    }

    public String getSoundType() {
        return "Стандартный звук";
    }

    public void showInfo() {
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Звук: " + sound);
    }
}

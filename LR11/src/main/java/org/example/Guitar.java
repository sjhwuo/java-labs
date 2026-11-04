package org.example;

public class Guitar extends Instrument {
    private final int strings;

    public Guitar(String name, String type, String sound, int strings) {
        super(name, type, sound);
        this.strings = strings;
    }

    @Override
    public String getSoundType() {
        return "Струнный звук";
    }

    public void play(String melody, int volume) {
        System.out.println(getName() + ": играю мелодию " + melody
                + " на громкости " + volume);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Количество струн: " + strings);
        System.out.println("Тип звучания: " + getSoundType());
    }
}

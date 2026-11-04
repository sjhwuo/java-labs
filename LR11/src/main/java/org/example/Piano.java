package org.example;

public class Piano extends Instrument {
    private final int keys;

    public Piano(String name, String type, String sound, int keys) {
        super(name, type, sound);
        this.keys = keys;
    }

    @Override
    public String getSoundType() {
        return "Клавишный звук";
    }

    public void play(String melody, boolean withPedal) {
        String pedal = withPedal ? "с педалью" : "без педали";
        System.out.println(getName() + ": играю мелодию " + melody + " " + pedal);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Количество клавиш: " + keys);
        System.out.println("Тип звучания: " + getSoundType());
    }
}

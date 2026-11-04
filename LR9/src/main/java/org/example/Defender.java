package org.example;

public class Defender extends Sportsman {
    private int tackles;
    private int interceptions;

    public Defender(String name, String team, int number,
                    int tackles, int interceptions) {
        super(name, team, number);
        this.tackles = tackles;
        this.interceptions = interceptions;
    }

    @Override
    public String getPosition() {
        return "Защитник";
    }

    @Override
    public String getStatistics() {
        return tackles + " отборов, "
                + interceptions + " перехватов";
    }

    @Override
    public void displayInfo() {
        System.out.println("Защитник ");
        super.displayInfo();
    }
}
package org.example;

public class Forward extends Sportsman {
    private int goals;
    private int assists;

    public Forward(String name, String team, int number,
                   int goals, int assists) {
        super(name, team, number);
        this.goals = goals;
        this.assists = assists;
    }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    @Override
    public String getStatistics() {
        return goals + " голов, " + assists + " передач";
    }

    @Override
    public void displayInfo() {
        System.out.println(" Нападающий ");
        super.displayInfo();
    }
}
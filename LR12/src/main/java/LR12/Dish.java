package LR12;

public class Dish {
    protected String name;
    protected int id;
    protected double volume;

    public Dish(String name, int id, double volume) {
        this.name = name;
        this.id = id;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "id=" + id + ", объем=" + volume;
    }
}
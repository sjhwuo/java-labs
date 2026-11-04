package LR12;

public class Plate extends Dish {
    private double diameter;

    public Plate(String name, int id, double volume, double diameter) {
        super(name, id, volume);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Тарелка: " + name + ", " + super.toString()
                + ", диаметр=" + diameter;
    }
}
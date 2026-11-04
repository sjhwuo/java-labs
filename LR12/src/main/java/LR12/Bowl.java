package LR12;

public class Bowl extends Dish {
    private double depth;

    public Bowl(String name, int id, double volume, double depth) {
        super(name, id, volume);
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Миска: " + name + ", " + super.toString()
                + ", глубина=" + depth;
    }
}
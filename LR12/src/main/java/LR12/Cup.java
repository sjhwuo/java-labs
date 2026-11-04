package LR12;

public class Cup extends Dish {
    private boolean handle;

    public Cup(String name, int id, double volume, boolean handle) {
        super(name, id, volume);
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Чашка: " + name + ", " + super.toString()
                + ", ручка=" + handle;
    }
}
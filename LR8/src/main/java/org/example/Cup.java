package org.example;

class Cup extends Dishware {
    private boolean handle;

    public Cup(String name, double volume, String color, boolean handle) {
        super(name, volume, color);
        this.handle = handle;
    }

    public boolean isHandle() {
        return handle;
    }

    public void setHandle(boolean handle) {
        this.handle = handle;
    }

    @Override
    public void use() {
        System.out.println("Для напитков");
    }

    public void fill() {
        System.out.println("Чашка наполняется напитком");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", наличие ручки: " + (handle ? "да" : "нет");
    }
}
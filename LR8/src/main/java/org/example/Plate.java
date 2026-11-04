package org.example;

class Plate extends Dishware {
    private double diameter;

    public Plate(String name, double volume, String color, double diameter) {
        super(name, volume, color);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Для подачи еды");
    }

    public void stack() {
        System.out.println("Тарелку можно поставить в стопку");
    }

    @Override
    public String toString() {
        return super.toString() + ", диаметр: " + diameter + " см";
    }
}
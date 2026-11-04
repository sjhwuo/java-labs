package org.example;

class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        salary = salary + salary * percent / 100;
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", "Программист", 2000);

        employee.raiseSalary(10);

        System.out.println("Имя: " + employee.getName());
        System.out.println("Должность: " + employee.getPosition());
        System.out.println("Новая зарплата: " + employee.getSalary());
    }
}
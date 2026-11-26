package task2.model;

import utils.Validator;

public abstract class Employee implements Cloneable{

    private final int id;
    private String name;
    private double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        Validator.requirePositive(id, "id", this);
        Validator.requireString(name, "name", this);
        Validator.requirePositive(basicSalary, "basicSalary", this);
        this.id = id;
        setName(name);
        setBasicSalary(basicSalary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract int getBonusPercent();
    public double calculateFinalSalary() {
        return basicSalary + (basicSalary * getBonusPercent() / 100);
    }

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();

    @Override
    public abstract Employee clone();
}

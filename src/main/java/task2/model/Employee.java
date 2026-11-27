package task2.model;

import utils.Validator;

public abstract class Employee {

    private static final double EPSILON = 1e-9;

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

    public abstract int getBonusPercent();

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

    public double calculateFinalSalary() {
        return basicSalary + (basicSalary * getBonusPercent() / 100);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Developer other = (Developer) obj;
        return this.getId() == other.getId() &&
                this.getName().equals(other.getName()) &&
                Math.abs(this.getBasicSalary() - other.getBasicSalary()) < EPSILON;
    }

}





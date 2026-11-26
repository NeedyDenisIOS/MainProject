package task2.model;

public abstract class Employee implements Cloneable{

    private final int id;
    private String name;
    private double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        if (id <= 0) {
            throw new IllegalArgumentException("Incorrect ID value");
        }
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
        if (name == null) {
            throw new IllegalArgumentException("Incorrect name value");
        }
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary <= 0) {
            throw new IllegalArgumentException("Incorrect salary value");
        }
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

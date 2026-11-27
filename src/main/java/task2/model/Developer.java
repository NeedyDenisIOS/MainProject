package task2.model;

public class Developer extends Employee implements Cloneable {

    public Developer(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public int getBonusPercent() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("""
                        Id: %d
                        Name: %s
                        Salary: %.2f""",
                getId(), getName(), calculateFinalSalary());
    }

    @Override
    public Developer clone() {
        return new Developer(getId(), getName(), getBasicSalary());
    }

}

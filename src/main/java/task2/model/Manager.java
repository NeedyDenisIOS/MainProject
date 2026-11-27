package task2.model;

public class Manager extends Employee {

    public Manager(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public int getBonusPercent() {
        return 5;
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
    public Manager clone() {
        return new Manager(getId(), getName(), getBasicSalary());
    }
}

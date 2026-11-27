package task2.model;

public class Intern extends Employee implements Cloneable {

    public Intern(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public int getBonusPercent() {
        return 10;
    }

    @Override
    public Intern clone() {
        return new Intern(getId(), getName(), getBasicSalary());
    }
}

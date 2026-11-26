package task2.model;

import utils.Validator;

public class Intern extends Employee{

    public Intern(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public int getBonusPercent() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Intern other = (Intern) obj;
        return Validator.safeEquals(this.getId(), other.getId());
    }

    @Override
    public String toString() {
        return String.format("""
                        Id: %d
                        Name: %s
                        Salary: %.2f"""
                ,getId(), getName(), calculateFinalSalary());
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }

    @Override
    public Intern clone() {
        return new Intern(getId(), getName(), getBasicSalary());
    }
}

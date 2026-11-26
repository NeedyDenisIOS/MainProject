package task2.model;

import utils.Validator;

public class Manager extends Employee{

    public Manager(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public int getBonusPercent() {
        return 5;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return true;
      Manager other = (Manager) obj;
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
    public Manager clone() {
        return new Manager(getId(), getName(), getBasicSalary());
    }
}

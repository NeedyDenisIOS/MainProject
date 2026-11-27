package task2;

import task2.model.Developer;
import task2.model.Employee;
import task2.model.Intern;
import task2.model.Manager;
import utils.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        employees[0] = new Developer(101, "Alex", 100);
        employees[1] = new Intern(102, "Oleg", 50);
        employees[2] = new Manager(103, "Anna", 200);

        System.out.println("Original list of employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Employee richest = employees[0];
        for (Employee e : employees) {
            if (e.calculateFinalSalary() > richest.calculateFinalSalary()) {
                richest = e;
            }
        }
        System.out.println("The highest‑paid employee is " + richest.getName() + " with salary " + richest.calculateFinalSalary());

        System.out.println("A 10 percent increase in salary.");
        for (Employee e : employees) {
            double newSalary = e.getBasicSalary() * 1.1;
            e.setBasicSalary(newSalary);
        }

        for (Employee e : employees) {
            System.out.println(e);
        }

        Developer original = new Developer(112, "Denis", 500);
        Developer copy = original.clone();

        System.out.println("Comparison of references: " + (original == copy));
        System.out.println("Comparison of values: " + (original.equals(copy)));

        System.out.println("Clone independence");
        copy.setBasicSalary(2300);

        System.out.println(copy);


        System.out.println("Show the employee by index");
        int index = sc.nextInt();
        Validator.requireValidIndex(index, employees.length, employees);
        System.out.println(employees[index]);
    }
}

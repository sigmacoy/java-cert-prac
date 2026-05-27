package Reviewer_2026._1;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String n, double b){
        name = n;
        baseSalary = b;
    }

    public double calculateBonus(){
        return 0.0;

    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
}

class Manager extends Employee {
    public Manager(String n, double b){
        super(n, b);
    }
    public double calculateBonus(){
        return getBaseSalary() * 0.2;
    }
}

class Developer extends Employee {
    public Developer(String n, double b){
        super(n, b);
    }
    public double calculateBonus(){
        return (getBaseSalary() * 0.15);
    }
}

class Intern extends Employee {
    public Intern(String n, double b){
        super(n, b);
    }
    public double calculateBonus(){
        return (getBaseSalary() * 0.05);
    }

}

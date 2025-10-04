package LabSheet3;

public class Employee {
    String name;
    double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

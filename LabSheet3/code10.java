package LabSheet3;

class SalaryUpdater {
    void update(Employee e, double bonus) {
        e.salary += bonus;
    }
}


public class code10 {
    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        SalaryUpdater su = new SalaryUpdater();
        su.update(e, 5000);
        e.display();
    }
}

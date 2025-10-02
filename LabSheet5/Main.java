package LabSheet5;

public class Main {
    public static void main(String[] args){
        Animal obj=new Dog();
        obj.makeSound();

        // Test for member access modifiers
        A a=new A();
        a.display();
        B b=new B();
        b.show();

        // Test for multilevel inheritance
        ElectricCar ec=new ElectricCar();
        ec.start();
        ec.drive();
        ec.charge();

        // Test for method overriding with polymorphic method calls
        ParentClass pc=new ChildClass();
        pc.show();

        // Test for superclass reference pointing to subclass object
        SuperClass sc=new SubClasss();
        sc.display();

        // Test for using super to access superclass method
        Sub sub=new Sub();
        sub.display();
    }
}

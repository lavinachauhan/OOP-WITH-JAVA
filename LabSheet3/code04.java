package LabSheet3;

class Circle {
    double radius;

    Circle(double r) { radius = r; }

    double area() { return Math.PI * radius * radius; }
}

public class code04 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Circle Area: " + c.area());
    }
}


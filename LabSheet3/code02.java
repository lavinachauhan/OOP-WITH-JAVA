package LabSheet3;

class Rectangle {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double area() { return width * height; }
    double perimeter() { return 2 * (width + height); }
}

public class code02 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area: " + rect.area() + ", Perimeter: " + rect.perimeter());
    }
}

package LabSheet3;

public class Car {
    int speed;
    String color;

    public Car setSpeed(int s) { speed = s; return this; }
    public Car setColor(String c) { color = c; return this; }

    public void display() {
        System.out.println("Car speed: " + speed + ", Color: " + color);
    }
}

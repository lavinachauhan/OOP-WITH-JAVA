package LabSheet3;

class Vehicle {
    int speed;
    String color;

    Vehicle() {}

    Vehicle(int s, String c) { speed = s; color = c; }

    void startEngine() {
        System.out.println("Engine started...");
    }

    void setSpeed(int s) { speed = s; }
    void setSpeed(int s, int bonus) { speed = s + bonus; }

    void display() { System.out.println("Speed: " + speed + ", Color: " + color); }
}

public class code06 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.startEngine();
        Vehicle v2 = new Vehicle(80, "Red");
        v2.display();
        v2.setSpeed(100, 20);
        v2.display();
    }
}

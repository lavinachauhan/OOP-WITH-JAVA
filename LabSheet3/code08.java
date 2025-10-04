package LabSheet3;

class Person {
    void fullName(String first, String last) {
        System.out.println(first + " " + last);
    }
}

public class code08 {
    public static void main(String[] args) {
        Person p = new Person();
        p.fullName("Lavina", "Chauhan");
    }
}

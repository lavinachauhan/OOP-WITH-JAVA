package LabSheet3;

class Book1 {
    String title, author;
    double price;

    Book1(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class code01 {
    public static void main(String[] args) {
        Book1 b1 = new Book1("Java Basics", "Sharad", 399.99);
        b1.display();
    }
}

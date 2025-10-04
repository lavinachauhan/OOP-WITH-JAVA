package LabSheet3;

class Student {
    int marks;
    Student(int m) { marks = m; }
}

class Updater {
    Student updateMarks(Student s, int extra) {
        return new Student(s.marks + extra);
    }
}

public class code11 {
    public static void main(String[] args) {
        Student st = new Student(70);
        Updater up = new Updater();
        Student st2 = up.updateMarks(st, 10);
        System.out.println("Updated Marks: " + st2.marks);
    }
}

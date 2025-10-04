package LabSheet3;

class StudentEncap {
    private String name;
    private int marks;

    public String getName() { return name; }
    public void setName(String n) { name = n; }

    public int getMarks() { return marks; }
    public void setMarks(int m) { marks = m; }
}

public class code03 {
    public static void main(String[] args) {
        StudentEncap sEnc = new StudentEncap();
        sEnc.setName("Aman");
        sEnc.setMarks(85);
        System.out.println("Name: " + sEnc.getName() + ", Marks: " + sEnc.getMarks());
    }
}


package LabSheet3;

class BookRef {
    String title;
}

public class code09 {
    public static void main(String[] args) {
        BookRef br1 = new BookRef();
        br1.title = "Java";
        BookRef br2 = br1; // same reference
        br2.title = "Python";
        System.out.println("br1.title = " + br1.title);
        System.out.println("br2.title = " + br2.title);
    }
}


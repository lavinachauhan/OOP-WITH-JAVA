package LabSheet1;

import java.util.Scanner;

public class code05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);

        sc.close();
    }
}

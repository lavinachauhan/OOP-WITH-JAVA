package LabSheet1;

import java.util.Scanner;

public class code08 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println("Not an alphabet character.");
        }

        sc.close();
    }
}

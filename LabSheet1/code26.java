package LabSheet1;

import java.util.Scanner;

public class code26 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int first = num / 10000; 
        int last = num % 10;     

        if (first == last) {
            System.out.println("First and Last digits are the same.");
        } else {
            System.out.println("First and Last digits are NOT the same.");
        }

        sc.close();
    }
}

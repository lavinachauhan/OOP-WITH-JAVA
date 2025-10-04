package LabSheet1;

import java.util.Scanner;

public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        float num = sc.nextFloat();

        int converted = (int) num; // Explicit conversion

        System.out.println("Original floating-point value: " + num);
        System.out.println("Converted integer value: " + converted);

        sc.close();
    }
}

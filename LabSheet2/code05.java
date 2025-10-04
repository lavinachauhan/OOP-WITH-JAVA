package LabSheet2;
import java.util.Scanner;

class BinaryOctalConverter {
    public static String binaryToOctal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toOctalString(decimal);
    }
}

public class code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        System.out.println("Octal: " + BinaryOctalConverter.binaryToOctal(binary));
        sc.close();
    }
}

package LabSheet2;
import java.util.Scanner;

class BinaryDecimalConverter {
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}

public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimal = BinaryDecimalConverter.binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary again: " + BinaryDecimalConverter.decimalToBinary(decimal));
        sc.close();
    }
}

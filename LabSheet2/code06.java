package LabSheet2;
import java.util.Scanner;

class OctalDecimalConverter {
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
}

public class code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();
        System.out.println("Decimal: " + OctalDecimalConverter.octalToDecimal(octal));
        sc.close();
    }
}

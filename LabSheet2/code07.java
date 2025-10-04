package LabSheet2;
import java.util.Scanner;

class Factorial {
    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}

public class code07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + Factorial.factorial(n));
        sc.close();
    }
}

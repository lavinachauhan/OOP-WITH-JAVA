package LabSheet2;
import java.util.Scanner;

class SumToN {
    public static int summ(int n) {
        if(n == 1) return 1;
        return n + summ(n - 1);
    }
}

public class code08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        System.out.println("Sum from 1 to " + n + " is: " + SumToN.summ(n));
        sc.close();
    }
}


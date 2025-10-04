package LabSheet2;
import java.util.Scanner;

class Fibonacci {
    public static int fibo(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}

public class code09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci number: " + Fibonacci.fibo(n));
        sc.close();
    }
}

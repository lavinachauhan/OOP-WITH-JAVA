package LabSheet2;
import java.util.Scanner;

class PrimeInterval {
    public static void displayPrimes(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(PrimeCheck.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}



public class code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of interval: ");
        int start = sc.nextInt();
        System.out.print("Enter end of interval: ");
        int end = sc.nextInt();
        System.out.print("Prime numbers: ");
        PrimeInterval.displayPrimes(start, end);
        sc.close();
    }
}

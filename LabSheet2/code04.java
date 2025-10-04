package LabSheet2;
import java.util.Scanner;

class NeonNumberCheck {
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while(square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
}

public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(NeonNumberCheck.isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
        sc.close();
    }
}

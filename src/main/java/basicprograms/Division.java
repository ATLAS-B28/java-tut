package basicprograms;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for the division: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int numerator = 0, denominator = 0;
        if(num1 > num2) {
            numerator = num1;
            denominator = num2;
        } else if(num1 < num2) {
            numerator = num2;
            denominator = num1;
        } else if(num1 == 0 || num2 == 0) {
            System.out.println("Enter non-zero number");
        } else {
            System.out.println("Enter a valid number");
        }

        int quotient = numerator / denominator;
        int rem = numerator % denominator;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + rem);
    }
}

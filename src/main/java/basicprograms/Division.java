package basicprograms;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for the division: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int res = (num1 > num2) ? num1 : num2;
        int res1 = (num1 % 2 == 0) ? num1 : (num2 % 2 == 0) ? num2 : (char) 0;
        System.out.println("Checking for diff. aspects: ");
        System.out.println(res);
        System.out.println(res1);
        if(res1 == 0) System.out.println("both are odd");
        res = num1 > num2 ? num1 > num3 ? num1 : num2 : num2 > num3 ? num2 : num3;
        System.out.println("Out of 3: " + res);

        int numerator = 0, denominator = 0;
        /*if(num1 > num2) {
            numerator = num1;
            denominator = num2;
        } else if(num1 < num2) {
            numerator = num2;
            denominator = num1;
        } else if(num1 == 0 || num2 == 0) {
            System.out.println("Enter non-zero number");
        } else {
            System.out.println("Enter a valid number");
        }*/
        numerator = (num1 > num2) ? num1 : num2;
        denominator = (num1 < num2) ? num1 : num2;

        int quotient = numerator / denominator;
        int rem = numerator % denominator;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + rem);

        /*String yesOrNo = sc.nextLine();

        if(yesOrNo.equals("yes")) {
            System.out.println("Okay");
        } else {
            System.out.println("Not Okay");
        }*/
    }
}

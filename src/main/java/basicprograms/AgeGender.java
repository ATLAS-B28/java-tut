package basicprograms;

import java.util.Scanner;

public class AgeGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        /*if(gender.equals("m")) {
            if(age > 25) {
                System.out.println("Eligible for policy 2");
            } else {
                System.out.println("Eligible for policy 3");
            }
        } else if (gender.equals("f")) {
            if(age > 25) {
                System.out.println("Eligible for policy 1");
            } else {
                System.out.println("Eligible for policy 3");
            }
        } else {
            System.out.println("Eligible for policy 3");
        }*/

        if(age > 25) {
            if(gender.equals("f")) {
                System.out.println("Eligible for policy 1");
            } else if(gender.equals("m")) {
                System.out.println("Eligible for policy 2");
            } else {
                System.out.println("Input either m or f");
            }
        } else {
            System.out.println("Eligible for policy 3");
        }
    }
}

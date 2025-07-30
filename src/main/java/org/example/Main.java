package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        /*System.out.println("Input the temperature in Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit - 32.0f) * (5.0f / 9.0f);
        System.out.println(celsius);

        System.out.println("Input a number: ");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("Input SP and CP: ");
        int sp = scanner.nextInt();
        int cp = scanner.nextInt();
        if(sp > cp) {
            int pro = sp - cp;
            double profitPercent = (double) pro / cp * 100;
            System.out.println("Profit: " + pro + " (" + profitPercent + "%)");
        } else if(cp > sp) {
            int loss = cp - sp;
            double lossPercent = (double) loss / sp * 100;
            System.out.println("Loss: " + loss + " (" + lossPercent + "%)");
        }
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();
        int temp = num;//create a temp variable so the original remains same
        int numLen = String.valueOf(num).length();
        while(temp > 0) {
            int digit = temp % 10;//get the last digit
            //sum += digit
            sum += (int) Math.pow(digit, numLen);//do the raise to power using numLen
            temp /= 10;//remove the last digit
        }
        //System.out.println(sum);
        if(sum == num) {//compare the original number with the sum
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

    }

}
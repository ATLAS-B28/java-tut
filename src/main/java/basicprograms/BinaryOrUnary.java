package basicprograms;

import java.util.Scanner;

public class BinaryOrUnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a symbol to check as binary or unary: ");
        String symbol = sc.nextLine();
        /*String[] binary = {"*", "+","-"};
        String[] unary = {"++","!","--"};
        boolean isBinary = false;
        boolean isUnary = false;
        for(String operator : binary) {
            if(operator.equals(symbol)) {
                isBinary = true;
                System.out.println(symbol + "is binary: " + isBinary);
            }
        }
        for(String operator: unary) {
            if(operator.equals(symbol)) {
                isUnary = true;
                System.out.println(symbol + " is unary: " + isUnary);
            }
        }*/
        switch (symbol) {
            case "+":
            case "-":
                System.out.println(symbol + " is both unary and binary");
                break;
            case "*":
            case "/":
            case "%":
                System.out.println(symbol + " is binary");
                break;
            case "++":
            case "--":
            case "!":
                System.out.println(symbol + " is unary");
                break;
            default:
                System.out.println("Enter valid symbols");
        }

        System.out.println("Using the symbol above to perform operation: ");
        System.out.println("Input 2 numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        switch (symbol) {
            case "+":
                System.out.println("Add: " + (num1+num2));
                break;
            case "-":
                System.out.println("Subtract: " + (num1-num2));
                break;
            case "*":
                System.out.println("Multiply: " + (num1*num2));
                break;
            case "/":
                System.out.println("Divide: " + (num1/num2));
                break;
            case "++":
                System.out.println("Pre-increment num1: " + ++num1);
                break;
            case "--":
                System.out.println("Pre-decrement num1: " + --num1);
                break;
            case "!":
                System.out.println("Not equal: " + (num1!=num2));
            default:
                System.out.println("Exit");
        }


    }
}

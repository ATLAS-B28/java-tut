package basicprograms;

import java.util.Scanner;

public class CheckASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        System.out.println("ASCII of each input character: \n");
        for(int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if(ch >= '0' && ch <= '9') {
                int ascii = ch - '0';
                System.out.println(ch + " is numeric with ASCII is: " + ascii + " and in ASCII table: " + (int) ch);
            }  else if(ch >= 'A' && ch <= 'Z') {
                int ascii = ch - 'A';
                System.out.println(ch + " is uppercase alphabet with ASCII is: " + ascii + " and in ASCII table: " + (int) ch);
            } else if(ch >= 'a' && ch <= 'z') {
                int ascii = ch - 'a';
                System.out.println(ch + " is lowercase alphabet with ASCII is: " + ascii + " and in ASCII table: " + (int) ch);
            } else {
                System.out.println(ch + " is not valid");
            }
        }


    }
}

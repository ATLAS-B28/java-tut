package basicprograms;

import java.util.Scanner;

public class CheckASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        String num = sc.nextLine();
        for(int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if(ch >= '0' && ch <= '9') {
                System.out.println(ch + " is numeric");
            } else {
                System.out.println(ch + " is not numeric");
            }
        }


    }
}

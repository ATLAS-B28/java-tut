package basicprograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while(num > 0) {
            int rem = num % 10;//get the last digit
            reverse = reverse * 10 + rem;
            num /= 10;//remove the last digit
        }

        System.out.println(reverse);
    }
}

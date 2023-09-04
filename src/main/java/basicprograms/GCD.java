package basicprograms;
import java.util.Scanner;
public class GCD {
    //main function
    //gcd of two numbers
    public static void main(String[] args) {
        //compare number starting from 1 to number ith
        //were if the 2  numbers are divisible by ith then ith is the gcd
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a: " + a + " b: " + b);
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("gcd: " + gcd);
    }
}

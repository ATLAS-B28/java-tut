package basicprograms;
import java.util.Scanner;
public class BitwiseSwap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a: "+a+" b: "+b);
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a: "+a+" b: "+b);
    }
}

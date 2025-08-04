package basicprograms;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*for(count = 100; count >= 50; count--) {
            if(count % 2 == 0) {
                System.out.println(count + "\n");

            }

        }
        int res = 0;
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) res += i;
        }
        System.out.println(res);*/
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) System.out.println(num + " x " + i + " = " + (num * i));*/
        /*for(int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }*/
        Scanner sc = new Scanner(System.in);
       /* int res = 0;
        String num = sc.nextLine();
        System.out.println(num.toCharArray());

        for(int i = 0; i < num.length(); i++) {
            int charDigit = num.charAt(i) - '0';
            System.out.println(charDigit);
            res += charDigit ;

        }
*/
        /*int num1 = 1;
        int res1 = 0;
        while(num1 > 0) {
            num1 = sc.nextInt();
            if(num1>0) res1 += num1;
            num1--;
        }
        int num2;
        int res2 = 0;
        do {
           num2 = sc.nextInt();
           res2 += num2;
        } while(num2 > 0);
        System.out.println("used while loop answer(enter 0 to end loop): " + res1);
        System.out.println("used do while loop answer: " + res2);*/

        int option, n1, n2;
        String choice;
        do{
            System.out.println("Enter 2 numbers: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            System.out.println("Choose an operation from 1 to 4: ");
            System.out.println("1)Add\n2)Subtract\n3)Multiply\n4)Divide");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Addition: " + (n1+n2));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (n1-n2));
                    break;
                case 3:
                    System.out.println("Multiply: " + (n1*n2));
                    break;
                case 4:
                    System.out.println("Divide: Quotient" + (n1/n2) + " Remainder: " + (n1%n2));
                    break;
                default:
                    System.out.println("Please inout valid option");
            }
            System.out.println("Do you want to continue: ");
            choice = sc.next();

        }while(choice.equals("yes"));

        /*System.out.println("use for loop " + res);*/
    }
}

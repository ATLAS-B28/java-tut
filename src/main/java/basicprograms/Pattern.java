package basicprograms;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Pattern {
    //pyramid pattern
    //to print * we use 2*i-1 as the * printed is the number of odd numbers
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows = sc.nextInt();
        /*for(int i = 1 ;i<= rows;i++){
            for(int j = 1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int  i = 0; i < rows; i++) {
            for(int j = 0; j < rows-i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < rows; j++) {
                if(i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*for(int i = 1, j = 1; i <= rows && j <= rows; i++, j++) {
            System.out.print(i + " " + j + "\n");
        }
        for(int i = 1; i<=50 && i > 0; i++) {
            System.out.print(i + "\n");
        }*/
        System.out.println();
        for(int iOuter = 0; iOuter < 6; iOuter++) {
            for(int jInner = 0; jInner < 2; jInner++) {
                if(iOuter == jInner) continue;
                System.out.println(iOuter + " " + jInner);
            }
        }

        /*System.out.println("Enter non zero number for iterations(will run up to 1): ");
        int loopCheck = 1;
        while(loopCheck != 0) {
            loopCheck = sc.nextInt();
            if (loopCheck % 5 == 0) {
                System.out.println(loopCheck + " is multiple of 5");
            } else {
                System.out.println("Enter multiple of 5");
                continue;
            }
            loopCheck--;
            System.out.print(loopCheck);

        }*/
        /*for(int i = 0; i < rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        for(int i = 2; i<= 7; i++) {
            int fact = 1;
            for(int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.print(fact);
            System.out.println(" ");

        }
        int num = 1;
        for(int i = 0; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
        System.out.println("Enter 2 numbers as lower number & upper number: ");
        System.out.println("Lower number: ");
        int n1 = sc.nextInt();
        System.out.println("Upper number: ");
        int n2 = sc.nextInt();
        for(int i = n1; i < n2; i+=3) {
            System.out.println(i);
        }*/
    }
}

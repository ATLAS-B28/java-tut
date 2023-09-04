package basicprograms;
import java.util.Scanner;
public class Pattern {
    //pyramid pattern
    //to print * we use 2*i-1 as the * printed is the number of odd numbers
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows = sc.nextInt();
        for(int i = 1 ;i<= rows;i++){
            for(int j = 1;j<=rows-i;j++){
                System.out.println(" ");
            }
            for(int k = 1;k<= 2*i-1;k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

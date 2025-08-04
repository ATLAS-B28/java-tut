package basicprograms;
import java.util.Scanner;
public class PrimeNum {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       //initiate prime variable as true
       System.out.println("Done using if-else statement: ");
       boolean prime = true;
       if(num <= 1){
           prime = false;
       }else{
           //until the square root of num is smaller or equal to i's value -> i++
           for(int i = 2; i<= Math.sqrt(num);i++){
               if(num % 2 ==0){//<- num is divisible by 2 so it has factors other than 1 and itself
                   prime = false;
                   break;
               }
           }
       }
       if(prime){
           System.out.println(num+" is a prime number");
       }else{
           System.out.println(num+" is not a prime number");
       }
       System.out.println("Done using for loop: ");
       boolean flag = true;
       for(int i = 2; i<=Math.sqrt(num); i++) {
           if(num%i==0) {
               flag=false;
               break;
           }
       }
       if(flag) {
           System.out.println(num + " is prime number");
       } else {
           System.out.println(num + " is not prime number");
       }
       System.out.println("Done using while: ");
       int count = 0;
       int i = 1;
       while(i <= num) {
           if(num%i==0) {
               count++;
           }
           i++;
       }
       if(count==2) {
           System.out.println(num + " is prime number");
       } else {
           System.out.println(num + " is not prime number");
       }
   }
}

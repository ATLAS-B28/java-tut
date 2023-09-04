package basicprograms;

import java.util.Scanner;

public class Factorial {
    /*public int factorial(int n){
        //n*n-1....
        //so a var which saves prev value of and then multiplies with current value
        //for that we have fact = fact * i until i <= n then i++, n is imput number
        int fact = 1;
        for(int i  = 1; i<=n; i++){
           fact = fact * i;
        }
        return fact;
    }*/
    public int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial f = new Factorial();//<- cause the factorial is dynamic method
        System.out.println(f.factorial(n));
    }
}

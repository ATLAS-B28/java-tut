package org.methods;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Starting {

        //accessModifier static/non-static returnType methodName(parameterList) {
        // Method body
        // Code statements
        // Return statement (if returnType is not void) / if void print or just do the operation/logic as intended
        //}
       /* public static int addNum(int a,int b){
            return a + b;
        }
        public int multiple(int a, int b) {
            return a * b;
        }*/
        public static void swap(int a, int b) {
           /* int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping the variables: " + a + " & " + b);*/
            //without 3rd we can ues addition and then subtracting each to get the originals of the other
            a = a + b;
            b = a - b;//has a's original
            System.out.println(a);
            a = a - b;//has b's original
            System.out.println(a);
            System.out.println("After Swapping the variables without 3rd temp using addition\n" + a + " & " + b);
            //now we bitwise xor for integers
           /* a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("After Swapping the variables without 3rd temp using xor\n" + a + " & " + b);*/
        }
        //si using function and return printed si so si = prt/100
       /* public static void si(double rate, int principal, int time) {
            double siVal = (principal*rate*time)/100;
            System.out.println("SI: " + siVal);
        }
        public static boolean op(int a, int b) {
            return a%2==0&&b%2==0;
        }*/
        public static String identify(char a) {

            if(a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
                return "it is an alphabet";
            } else {
                return "it is not an alphabet";
            }
        }
        public static String identifyString(String a) {//<-formal argument
            for(int i = 0; i <= a.length(); i++) {
                if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                   return a + " is alphabet";
                }
            }
            return "all are not alphabet";
        }
        public static double pow(double a, double b) {
            double res = 1.0;//its multiplication bozo it should a initialized to 1 only not zero....
            for(int i = 0; i < b; i++) res*=a;
            return res;
        }

        public static void main(String[] args){
            /*int result = addNum(3,4);
            Starting starting = new Starting();//1st create an instance of a class and then only we can use non-static method
            int result2 = starting.multiple(4,6);
            System.out.println("Addition: "+result);
            System.out.println("Multiplication: "+result2);//but static need not require it
            swap(13, 14);
            si(7.5, 4000000, 5);
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(), b = sc.nextInt();
            boolean res3 = op(a,b);
            if(res3) {
                System.out.println(a + " and " + b + " are even");
            } else {
                System.out.println(a + " and " + b + " are not even");
            }*/
            Scanner sc = new Scanner(System.in);
            /*char input = sc.nextLine().charAt(0);
            String input1 = sc.nextLine();
            String output = identify(input);
            String output2 = identifyString(input1);//<-actual argument
            System.out.println(output);
            System.out.println(output2);*/
            double input2 = sc.nextDouble();
            double raiseTo = sc.nextDouble();
            double output3 = pow(input2, raiseTo);
            System.out.println(input2 + "'s power is raised to " + raiseTo + " is " + output3);

        }
}

package basicprograms;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the array size: ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Array of size: " + size);
        System.out.println("Input the elements: ");
        for(int i = 0; i <= size-1;i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for(int mark : marks) {
            sum += mark;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average is: ");
        System.out.println((double) sum/size);
        for(int mark : marks) {
            mark*=3;
            System.out.println(mark);
        }
    }
}

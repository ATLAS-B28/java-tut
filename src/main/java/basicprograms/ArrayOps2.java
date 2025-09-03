package basicprograms;

import java.util.Scanner;

public class ArrayOps2 {
    /**
     * 2 arrays, one defined by user and other predefined
     * 1st array defined in main and
     * 2nd array defined in main and prompted for user to input data
     * 1) Take input from user and store in 2nd array
     * 2) Search an element in 1st array and print the index
     * 3) Reverse contents of the 2nd array
     * 4) Sum of factorial of single digit positive numbers from 2nd array
     * if none print -1
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2nd array: ");
        int[] arr2 = getArr2(sc);
        //print both the arrays
        System.out.println("1st array: ");
        for(int num : arr1) {
            System.out.println(num);
        }
        System.out.println("2nd array: ");
        for(int num : arr2) {
            System.out.println(num);
        }
        //search an element in 1st array and print the index
        System.out.println("Enter the element to search in 1st array: ");
        findElement(sc, arr1);
        //reversing the 2nd array
        System.out.println("Reversing the 2nd array: ");
        reversing(arr2);
        //finding single digit and positive from 2nd array
        System.out.println("Finding single digit and positive from 2nd array: ");
        fact_single_positive(arr2);
    }

    private static void findElement(Scanner sc, int[] arr1) {
        int search = sc.nextInt();
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == search) {
                System.out.println("Element found at index: " + i);
            }
        }
    }

    private static int[] getArr2(Scanner sc) {
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        System.out.println("Enter the elements of 2nd array: ");
        for(int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        return arr2;
    }

    private static void fact_single_positive(int[] arr2) {
        boolean flag = false;
        int fact = 1;
        int sum = 0;
        for(int num : arr2) {
            if(num >= 0 && num < 10) {
                flag = true;
                for(int i = 1; i <= num; i++) {
                    fact *= i;
                }
                sum+= fact;
                System.out.println("Sum: " + sum);
                fact = 1;
            }
        }
        if(flag) {
            System.out.println("Sum of Factorials of single digit positive numbers from 2nd array: " + sum);
        } else {
            System.out.println("No single digit and positive numbers found");
        }
    }

    private static void reversing(int[] arr2) {
        for(int i = arr2.length - 1; i > -1; i--) {
            System.out.println(arr2[i]);
        }
    }
}

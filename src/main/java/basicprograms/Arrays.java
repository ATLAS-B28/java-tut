package basicprograms;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the array size: ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Array of size: " + size);
        System.out.println("Input the elements: ");
        for(int i = 0; i <= size-1;i++) {
            marks[i] = sc.nextInt();
        }
        /*int sum = 0;
        for(int mark : marks) {
            sum += mark;
        }

        //System.out.println("Sum: " + sum);
        //System.out.println("Average is: ");
        int start = 0;
        int end = size-1;
        System.out.println("Original Array: ");
        for(int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("Reversing the array: ");
        while(start < end) {
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array: ");
        for(int mark : marks) {
            System.out.println(mark);
        }
        //separate array
        System.out.println("Reversed array: ");
        int[] reversedArray = new int[size];
        for(int i = 0; i < marks.length; i++) {
            reversedArray[i] = marks[marks.length - 1 - i];
        }
        //a 2 pointer example
        //here check until i >= 0 then i-- and j++
        for(int i = marks.length-1, j = 0; i >= 0; i--,j++ ) {//<- another alternate code approach is good!!!
            reversedArray[j] = marks[i];
        }
        for(int mark : reversedArray) {
            System.out.println(mark);
        }
        System.out.println((double) sum/size);
        for(int mark : marks) {
            mark*=3;
            System.out.println(mark);
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1st array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i <= size1-1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Size of 2nd array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i <= size2-1; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[size1+size2];

        /*
        * copy using arraycopy func here the 1st is arr1 from 0 copy to arr3 from 0 up to length of arr1
        * same for arr2 but this time the start index for arr3 is length of arr1 as from there we start adding new array
        * remember no -1 as we are already adjusting for 0th index with func itself
        * */
        //System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        //System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        System.out.println("Combined array: ");
        for(int ele : arr3) {
            System.out.println(ele);
        }


    }


}

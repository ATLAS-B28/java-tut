package basicprograms;

import java.util.Scanner;

public class Matrix {
    //display function
    public static void displayMatrix(int[][] arr) {
        for(int[] ele: arr) {
            System.out.print("[");
            for (int i : ele) {
                System.out.print(i + ", ");
            }
            System.out.println("]");
        }
    }
    //a function to accept elements
    public static int[][] acceptMatrix(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                Scanner sc = new Scanner(System.in);
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        return arr;
    }
    //to add elements of 2 matrices
    public static void addMatrix(int[][] arr1, int[][] arr2) {
        int[][] sum = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        displayMatrix(sum);
    }
    //average of each row of a matrix
    //here the (i,0) is roll no. and the rest are marks
    public static void avgMarks(int[][] arr) {
        for(int[] ele : arr) {
            int sum = 0;
            for(int i = 1; i < ele.length; i++) {
                sum += ele[i];
            }
            System.out.println("Avg of " + ele[0] + " is " + sum/(ele.length-1));
        }
    }
    //find the transpose of a matrix
    public static void transpose(int[][] arr){
        int[][] transpose = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        displayMatrix(transpose);
    }

    //5x5 matrix where all the elements represent the cost of customer
    //purchase and if any of the value is > 100 then add +5% GST
    //and finally add the row wise sum for each customer
    public static void productCalculate(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > 100) {
                    int gst = (int) (arr[i][j] * 0.05);
                    arr[i][j] = arr[i][j] + gst;
                    System.out.println("GST for customer " + (i+1) + " is " + gst + " for product " + (j+1));
                }
                sum += arr[i][j];
            }
            System.out.println("Total cost of customer " + (i+1) + " is " + sum);
        }
    }

   /* public static void displayMatrix(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int val;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                Scanner sc = new Scanner(System.in);
                val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        for(int[] ele: arr) {
            System.out.print("[");
            for (int i : ele) {
                System.out.print(i);
            }
            System.out.println("]");
        }
    }*/

    public static void main(String[] args) {
      //1d - 1 row multiple columns
      //2d - 2 row multiple columns
      //matrix of m rows and n columns
       /* Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        for(int[] ele : arr) {
            System.out.print("[");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ele[j]);
            }
            System.out.println("]");
        }
        displayMatrix(rows, cols);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for 1st matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr1 = acceptMatrix(rows, cols);
        System.out.println("Matrix 1: ");
        displayMatrix(arr1);
        /*System.out.println("Enter the number of rows and columns for 2nd matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] arr2 = acceptMatrix(rows1, cols1);
        System.out.println("Matrix 2: ");
        displayMatrix(arr2);*/
        //System.out.println("Sum: ");
        //addMatrix(arr1, arr2);
        /*System.out.println("Average marks of each student: ");
        avgMarks(arr1);*/
       // System.out.println("Transpose: ");
        //transpose(arr1);
        System.out.println("Product: ");
        productCalculate(arr1);

    }
}

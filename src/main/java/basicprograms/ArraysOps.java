package basicprograms;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysOps {
    //rotation of array
    //3 function - reverse, rotate, main
    //in rotate function we normalize the number of times to rotate
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rotations: ");
        int rotations = sc.nextInt();
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        ArraysOps.rotateArray(a, rotations);
        System.out.println(Arrays.toString(a));
    }
    public static void rotateArray(int[] arr,int rotations){
        //to ensure the rotations are in the range of array
        //we do normalization i.e. rotations modulo n
        int n = arr.length;
        rotations = rotations % n;
        reverseArray(arr,0,n-1);//the entire array
        reverseArray(arr,0,rotations-1);//the part to be reversed
        reverseArray(arr,rotations,n-1);//the part to be reversed
    }
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}

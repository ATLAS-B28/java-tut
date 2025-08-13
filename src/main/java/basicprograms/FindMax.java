package basicprograms;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2000,4,89,7,690};
        int res = findMax(arr);
        System.out.println("Largest Number is: " + res);
    }
    //initiate the 1st element as largest and in if statement see whether the ith
    //element is < then it if so update the largest to the current ith element
    public static int findMax(int[] arr) {
        int largest = arr[0];
        for(int ele : arr) {
            if(largest < ele) {
                largest = ele;
            }
        }
        return largest;
    }
}

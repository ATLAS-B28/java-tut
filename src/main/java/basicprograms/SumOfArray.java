package basicprograms;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of all elements of an array: "+sum);
    }
}

package basicprograms;

import java.util.Iterator;
import java.util.Scanner;

public class Search {
    /*public static String search(int target, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return " Found at index: "+i;
            }
        }
        return " Not found";
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int searchTerm = sc.nextInt();
        String resIndex = search(searchTerm, arr);
        System.out.println("Search term: "+searchTerm+resIndex);

    }*/

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Input the index where to insert an element: ");
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        System.out.println("Input the element to be inserted: ");
        int ele = sc.nextInt();
        if(idx<=arr.length && idx >= 5) {
            arr[idx] = ele;
            for(int ele1 : arr) {
                System.out.println(ele1);
            }
        } else {
            System.out.println("Index is out of bounds");
        }

    }
}

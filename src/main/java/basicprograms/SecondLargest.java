package basicprograms;

import java.util.Arrays;

public class SecondLargest {
    public static int get2ndLargest(int[] arr,int total){
       /* int temp;
        for(int i=0; i< total; i++){
            for(int j=i+1; j<total; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        Arrays.sort(arr);
        return arr[total-2];
    }
    public static void main(String[] args){
        int[] a={1,2,5,6,3,2};
        System.out.println("Second Largest: "+get2ndLargest(a,6));
    }
}

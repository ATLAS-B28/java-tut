package basicprograms;

public class RemoveDuplicate {
    public static int RDE(int[] arr,int n){
        if(n==0||n==1){
            return 1;
        }
        int j=0;//j is the index of the new array
        for(int i=0; i<n-1; i++){//i<n-1 then i++
            if(arr[i] != arr[i+1]){//if element at i and i+1 are not equal then
                arr[j++] = arr[i];//set j to i's value and increment after that
            }
        }
        arr[j++] = arr[n-1];//assign the last element of array to arr[j]
                            // to include it in the new array
        //this is done to avoid the index out of bound exception as we are
        //doing i+1
        return j;//return a new element in the array
    }
    public static void main(String[] args){
        int[] arr = {20,20,10,30,40,30,50,50};
        int n = arr.length;
        System.out.println(RDE(arr,n));
        //here n=8 and at i=0 is 20 and i=1 is 20
        //then the condition if is not met, and we go to j++ to n-1 i.e. to 7th index
        //if i=1 and i=2 are not equal then j++
        //i.e. is set to 2 index and equal to index 1's value
    }
}

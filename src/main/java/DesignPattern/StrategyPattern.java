package DesignPattern;
import java.util.*;

//step - 1 define the strategy interface
interface  SortingStrategy{
    void sort(int[] nums);
}

//step - 2 implement concrete strategy class for bubble sort
class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] numbers){
        System.out.println("Bubble sort");
        int n = numbers.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted using Bubble Sort: "+Arrays.toString(numbers));
    }
}
//step - 3 implement concrete strategy class for quick sort
class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] numbers){
        quickSort(numbers,0,numbers.length-1);
        System.out.println("Sorted using Quick Sort: "+Arrays.toString(numbers));
    }
    private void quickSort(int[] numbers,int low,int high){
        if(low<high){
            int pivot = partition(numbers,low,high);
            quickSort(numbers,low,pivot-1);
            quickSort(numbers,pivot+1,high);
        }
    }
    private int partition(int[] numbers,int low,int high){
        int pivot = numbers[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(numbers[j] < pivot){
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;
        return i + 1;
    }
}

//step - 3 create context class that uses the strategy
class SortingContext{
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }
    public void sortNumbers(int[] numbers){
        sortingStrategy.sort(numbers);
    }

}
public class StrategyPattern{//<- behavioral pattern
    public static void main(String[] args){
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        SortingContext context = new SortingContext();
        SortingStrategy bubbleSortStrategy = new BubbleSortStrategy();
        context.setSortingStrategy(bubbleSortStrategy);

        context.sortNumbers(numbers);

        SortingStrategy quickSortStrategy = new QuickSortStrategy();
        context.setSortingStrategy(quickSortStrategy);

        context.sortNumbers(numbers);
    }
}
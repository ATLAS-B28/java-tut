package parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Parallel {

    private static int square(int number) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        long startTime = System.currentTimeMillis();

        //create executor service with fixe number of threads
       // ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService = Executors.newCachedThreadPool();
        //submit tasks to this service
        List<Future<Integer>> results = new ArrayList<>();

        for(int number: numbers) {
            Future<Integer> result = executorService.submit(() -> {
                int square = square(number);
                System.out.println("Squared number: " + square);
                return square;
            });
            results.add(result);
        }
        //shutdown
        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MIN_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(Future<Integer> result : results) {
            try {
                int squaredNumber = result.get();
                System.out.println("Squared number: " + squaredNumber);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime) + " millisecond");
    }
}

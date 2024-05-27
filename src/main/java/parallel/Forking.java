package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class Forking {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask sumTask = new SumTask(numbers, 0, numbers.length);

        Long result = forkJoinPool.invoke(sumTask);
        System.out.println("Sum: "+result);
    }

    static class SumTask extends RecursiveTask<Long> {

        private final int[] numbers;
        private final int start;
        private final int end;

        public SumTask(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if(end - start <= 1000) {
                long sum = 0;
                for(int i = start; i < end; i++) {
                    sum += numbers[i];
                }
                return sum;
            } else {
                int mid = (start + end ) / 2;
                SumTask leftTask = new SumTask(numbers, start, mid);
                SumTask rightTask = new SumTask(numbers, mid, end);

                invokeAll(leftTask, rightTask);

                return leftTask.join() + rightTask.join();
            }
        }

    }


}

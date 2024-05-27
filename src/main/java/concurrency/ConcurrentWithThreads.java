package concurrency;

public class ConcurrentWithThreads {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new CounterRunnable());
        Thread thread2 = new Thread(new CounterRunnable());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter value: " + counter);
    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            for(int i = 0; i < 1000; i++) {
                increment();
                System.out.println(counter);
            }
        }
    }

    private static synchronized void increment() {
        counter++;
    }
}

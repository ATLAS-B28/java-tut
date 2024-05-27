package concurrency;

public class MultiThread implements Runnable{
//us runnable to create threads
    public int threadNumber;

    public MultiThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting Thread " + threadNumber);
            Thread.sleep(3000);
            System.out.println("Resuming Thread " + threadNumber);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            MultiThread thread = new MultiThread(i);
            Thread threading = new Thread(thread);
            threading.start();
        }
    }
}

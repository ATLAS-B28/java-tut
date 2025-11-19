package concurrency;

public class Threads extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Starting Thread");
            Thread.sleep(3000);
            System.out.println("Resuming Thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Threads myThread = new Threads();
        myThread.start();
        System.out.println("Hello from main thread!");
    }
}
/*
public class Threads implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting Thread");
        try {
            Thread.sleep(3000);
            System.out.println("Resuming Thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Threads runnable = new Threads();
        Thread threading = new Thread(runnable);
        threading.start();
        System.out.println("Hello from the main thread");
    }
}*/

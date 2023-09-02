package concurrency;
class Task1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task1");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2");
        try{
            Thread.sleep(10000);//<-Causes the currently executing thread to sleep for the given number of milliseconds
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Task3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task3");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Chaining {
    public static void main(String[] args){
        //create threads
        Thread th1 = new Thread(new Task1());
        Thread th2 = new Thread(new Task2());
        Thread th3 = new Thread(new Task3());
        //chain them
        th1.start();
        try{
            th1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
        try{
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th3.start();
    }
}

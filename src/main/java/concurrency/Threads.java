package concurrency;
/*
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child thread: "+i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
public class Threads {
    public static void main(String[] args){//<-main thread
        //threads create->start
        MyThread myThread = new MyThread();
        myThread.start();
        //continue the execution
        for(int i=1;i<=5;i++){
            System.out.println("Main thread: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Main thread finished");
    }

}*/
//using runnable interface
class MyRunnable implements Runnable{
    private final String name;
    public MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for(int i=0; i<= 5; i++){
            System.out.println(name + " : " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Threads{
    public static void main(String[] args){
        //let's create 2 threads
        Thread th1 = new Thread(new MyRunnable("Thread 1"));
        Thread th2 = new Thread(new MyRunnable("Thread 2"));
        th1.start();
        th2.start();
        //then wait for thread to finish
        try{
            th1.join();
            th2.join();//<- waits for both threads to finish
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
    }
}
package concurrency;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class MyTask implements Runnable{
    private int taskId;
    public MyTask(int taskId){
        this.taskId = taskId;
    }
    @Override
    public void run(){
        System.out.println("Task "+taskId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Pooling {
    public static void main(String[] args){
        //create a pool of 5 threads
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i=1;i<=15;i++){
            Runnable task = new MyTask(i);//<- create a task
            exec.submit(task);//<- submit the task
        }
        //shutdown the pool
        exec.shutdown();
    }
}

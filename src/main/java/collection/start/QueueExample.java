package collection.start;
import java.util.LinkedList;
import java.util.Queue;
/*
* A Queue is a data structure in Java that
* represents a collection of elements in which
* elements are added at one end (rear) and removed
* from the other end (front). It follows the FIFO
* (First-In-First-Out) principle, meaning that the
* element that is added first will be the first one
* to be removed.
* */
public class QueueExample {
    public static void main(String[] args){
        Queue<String> qp = new LinkedList<>();
        qp.add("Abhijeet");
        qp.add("Aditya");
        qp.add("Aajatshatru");
        qp.add("Amit");
        String firstPerson = qp.peek();
        System.out.println(firstPerson);
        String removedPerson = qp.poll();
        System.out.println(removedPerson);
        System.out.println("Remaining names: ");
        for(String name: qp){
            System.out.println(name);
        }
    }
}

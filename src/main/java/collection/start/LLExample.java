package collection.start;
import java.util.LinkedList;
/*
* A LinkedList is a data structure in Java that
* implements the List interface. It is a linear
* collection of elements where each element is
* connected to the next and previous elements
* through pointers. It allows efficient insertion,
* removal, and modification of elements at both ends.
* */
public class LLExample {
    public static void main(String[] args) {
       LinkedList<String> names = new LinkedList<>();
       names.add("Abhijeet");
       names.add("Aditya");
       names.add("Aajatshatru");
       names.add("Amit");
       System.out.println(names);
       names.remove(0);
       System.out.println("Remaining names: ");
       for(String name: names){
           System.out.println(name);
       }
    }
}

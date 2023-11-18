package collection.start;
/*
* A HashMap is a data structure in Java that
* implements the Map interface. It stores key-value
* pairs and allows efficient retrieval and manipulation
* of data. The keys in a HashMap are unique,
* and each key is associated with a value.
* */
/*
* /*
*A List is a collection in Java that represents an
* ordered sequence of elements. It allows duplicate
* elements and maintains the insertion order of elements.
*/


import java.util.HashMap;
import java.util.Hashtable;
/*
public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer,String> ages = new HashMap<>();
        ages.put(1,"Abhijeet");
        ages.put(2,"Aditya");
        ages.put(3,"Aajatshatru");
        ages.put(4,"Amit");
        System.out.println(ages);
        ages.remove(1);
        System.out.println("Remaining names: ");
        for(Integer age: ages.keySet()){
            System.out.println(age);
        }
    }
}*/
/*
* In Java, the Hashtable interface is a part of the Java Collections
* Framework ,and it represents a hashtable, which is a data structure
* that stores key-value pairs. It is similar to the HashMap class,
* but it is synchronized, meaning it is thread-safe.
* */

public class HashMapExample{
    public static void main(String[] args){
        Hashtable<Integer,String> names = new Hashtable<>();
        names.put(1,"Abhijeet");
        names.put(2,"Aditya");
        names.put(3,"Aajatshatru");
        names.put(4,"Amit");
        System.out.println(names);
        names.remove(1);
        System.out.println("Remaining names: ");
        for(Integer age : names.keySet()){
            System.out.println(age + " " + names.get(age));
        }
    }
}
package collection.start;
import java.util.HashMap;
import java.util.Map;
/*
* A Map is an interface in Java that represents a
* collection of key-value pairs. It allows you to
* store, retrieve, and manipulate data based on
* unique keys. The keys in a Map are unique, and
* each key is associated with a value.
* */
public class MapExample {
    public static void main(String[] args){
        Map<Integer,String> ages = new HashMap<>();
        ages.put(1,"Abhijeet");
        ages.put(2,"Aditya");
        ages.put(3,"Aajatshatru");
        ages.put(4,"Amit");
        System.out.println(ages);
        ages.remove(1);
        System.out.println("Remaining names: ");
        for(Integer age: ages.keySet()){
            System.out.println(age+" "+ages.get(age));
        }
    }
}

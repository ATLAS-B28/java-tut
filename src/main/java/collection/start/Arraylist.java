package collection.start;
import java.util.ArrayList;
/*
 *A List is a collection in Java that represents an
 * ordered sequence of elements. It allows duplicate
 * elements and maintains the insertion order of elements.
 */
/*
* An ArrayList is a resizable array implementation of
* the List interface in Java. It provides dynamic
* resizing and allows you to add, remove, and access
* elements at specified positions.
* */
import java.util.List;
import java.util.LinkedList;
//List example with ArrayList
/*public class Arraylist {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);
        fruits.remove(1);
        System.out.println("Remaining fruits: ");
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}*/
//ArrayList example

public class Arraylist{
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
    }

}

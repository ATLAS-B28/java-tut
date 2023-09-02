package collection.start;
import java.util.Set;
import java.util.HashSet;
/*
* A Set is a collection in Java that represents a
* group of unique elements. It does not allow
* duplicate elements, and the order of the elements
* is generally undefined.
* */
public class SetExample {
    public static void main(String[] args){
        Set<Integer> ages = new HashSet<>();
        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        System.out.println(ages);
        ages.remove(1);
        System.out.println("Remaining names: ");
        for(Integer age: ages){
            System.out.println(age);
        }
    }
}

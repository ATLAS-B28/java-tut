package collection.start;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){
        ArrayList<String> cars  =new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String car : cars) {
            System.out.println(car);
        }

        Iterator<String> iterator = cars.iterator();

        while(iterator.hasNext()) {
            String ele = iterator.next();
            System.out.println(ele);
        }
    }
}

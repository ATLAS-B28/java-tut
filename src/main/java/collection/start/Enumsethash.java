package collection.start;
/*
* EnumMap is an implementation of the Map interface and is
* specifically designed for use with enum keys. It provides a
* high-performance, compact way to store enum keys and their
* corresponding values. It guarantees that the keys will be stored
* in the natural order of the enum declaration.
* EnumSet, on the other hand, is an implementation of the Set
* interface and is designed to work with enums as elements.
* It provides a high-performance, compact way to store a set of
* enum values. It uses a bit vector internally to represent the
* elements, making it very efficient for enum types.
* */
import java.util.EnumSet;
/*public class Enumsethash {
    enum Color{
        RED,GREEN,BLUE;
    }
    public static void main(String[] args){
        EnumSet<Color> enumSet = EnumSet.of(Color.RED,Color.BLUE);
        enumSet.add(Color.GREEN);
        System.out.println(enumSet.contains(Color.RED));
        enumSet.remove(Color.BLUE);
        //iterate
        for(Color color: enumSet){
            System.out.println(color);
        }
    }
}*/
import java.util.EnumMap;
public class Enumsethash{
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args){
        EnumMap<Day,String> enumMap = new EnumMap<>(Day.class);
        EnumSet<Day> enumSet = EnumSet.of(Day.MONDAY,Day.TUESDAY,Day.WEDNESDAY,Day.THURSDAY);
        enumSet.add(Day.SATURDAY);
        enumSet.add(Day.SUNDAY);
        enumSet.remove(Day.WEDNESDAY);
        System.out.println(enumSet);
        enumMap.put(Day.MONDAY,"Meeting");
        enumMap.put(Day.TUESDAY,"Gym");
        enumMap.put(Day.WEDNESDAY,"Shopping");
        enumMap.put(Day.THURSDAY,"Dinner");
        System.out.println(enumMap.get(Day.MONDAY));
        System.out.println(enumMap.containsKey(Day.TUESDAY));
        enumMap.remove(Day.WEDNESDAY);
        for(Day day: enumMap.keySet()){
            System.out.println(day+": "+enumMap.get(day));
        }
    }
}

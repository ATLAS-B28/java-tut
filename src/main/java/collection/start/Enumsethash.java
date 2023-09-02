package collection.start;
/*
* EnumSet is an efficient and compact implementation of
* the Set interface for enums. It is designed to work
* with enum types only and provides high-performance
* operations for set-like operations on enum values.
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

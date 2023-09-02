package stream.intro;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, 10);
        //print all numbers
        list.forEach(System.out::println);
        //get all the sum of numbers of even number
        int sumOfEvenNumber = list.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: "+sumOfEvenNumber);
        //get max num
        int maxNum = list.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Max number: "+maxNum);
        //check if all the numbers are > 0
        boolean allGreaterThanZero = list.stream()
                .allMatch(num -> num > 0);
        System.out.println("All numbers are > 0: "+allGreaterThanZero);
    }
}


//intermediate operation - map()
public class Stream{
     public static void main(String[] args){
         List<String> names = Arrays.asList("Abhijeet", "Aditya", "Aajatshatru", "Amit");
         List<Integer> nameLength = names.stream()
                 .map(String::length)
                 .toList();
         System.out.println(nameLength);
     }
}


//filter()
public class Stream{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n->n%2==0)
                .toList();
        System.out.println(evenNumbers);
    }
}



//sorted
//sort with no custom comparator
public class Stream{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedNumbers);
    }
}*/
//sort with custom comparator
class Person{
    private final String name;
    private final int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name + " : " + age;
    }
}
public class Stream{
    public static void main(String[] args){
        List<Person> numbers = Arrays.asList(
                new Person("Abhijeet", 29),
                new Person("Aditya", 21),
                new Person("Aajatshatru", 22),
                new Person("Amit", 23)
        );
        List<Person> sortedByAge = numbers.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .toList();
        System.out.println(sortedByAge);
    }
}



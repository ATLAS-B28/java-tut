package Experimental;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOps {
    int operation(int a, int b);
}

class User {
    String name;
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

public class FunctionalJava {


       public static void main(String[] args) {
           List<String> names = Arrays.asList("Aditya", "Abhijeet");
           names.forEach(System.out::println);
           //using stream api and do function chaining
           List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
           List<Integer> squareOfEven = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).toList();
           System.out.println(squareOfEven);
           //using functional interface which can have only one abstract method like here is operation
           MathOps add = Integer::sum;
           MathOps sub = (a,b) -> a-b;
           MathOps multiply = (a,b) -> a*b;

           System.out.println("Addition: " + add.operation(10,4));
           System.out.println("Subtract: " + sub.operation(10,8));
           System.out.println("Multiplication: " + multiply.operation(10,100));
           User user = null;
           String userNameMapping = Optional.ofNullable(user).flatMap(User::getName).orElse("Default");
           System.out.println(userNameMapping);
           //predicate - a boolean valued function of one argument.
           //Evaluates the condition and returns either true or false
           //it has abstract method -> boolean test(T t)
           List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
           Predicate<Integer> isEven = num -> num % 2 == 0;
           List<Integer> evenNums = nums.stream()
                   .filter(isEven)
                   .toList();
           System.out.println("Even numbers: "+ evenNums);
           Predicate<Integer> isGreaterThanThree = num -> num > 3;
           List<Integer> evenAndGreaterThanThree = nums.stream()
                   .filter(isEven.and(isGreaterThanThree))
                   .toList();
           System.out.println("Even and greater than three: " + evenAndGreaterThanThree);
           //Function - takes one argument of type T and produces the result of type R
           //it's used for transformation. abstract method -> R apply(T,R)
           List<String> names1 = Arrays.asList("Aditya", "Abhijeet", "Kakashi");
           Function<String, Integer> stringLen = String::length;
           List<Integer> lens = names1.stream()
                   .map(stringLen)
                   .toList();
           System.out.println("Lengths of names: " + lens);
           Function<Integer, String> intToString = i -> "Length: " + i;
           Function<String, String> stringAndThen = stringLen.andThen(intToString);
           List<String> transformedNames = names1.stream()
                   .map(stringAndThen)
                   .toList();
           System.out.println("Transformed names: " + transformedNames);
           //consumer - represents an operation that accepts a single input
           //of type T and returns no result/void. Used for operations that
           //have side effects like printing and logging
           //abstract method void accept(T t)
           List<String> greetings = Arrays.asList("Namaste","Namaskar","Ram Ram");
           Consumer<String> printGreetings =  System.out::println;
           greetings.forEach(printGreetings);
           Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
           Consumer<String> chained = printGreetings.andThen(printUpper);
           chained.accept("Greetings");
           //supplier - a supplier of results of type T, but takes no input arguments
           //abstract method - T get()
           Supplier<Double> randomNumGenerator = Math::random;
           double randomNum = randomNumGenerator.get();
           System.out.println("Random number: "+ randomNum);
       }
}

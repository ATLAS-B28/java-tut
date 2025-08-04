package Experimental;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
       }
}

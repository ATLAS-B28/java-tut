package stream.intro;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;


//terminal operation
/*
//collect
public class TerminalOp {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        List<Integer> squareNumbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(squareNumbers);
    }
}*/
//for-each
/*
public class TerminalOp{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        numbers.stream()
                .forEach(System.out::println);
    }
}*/
//reduce
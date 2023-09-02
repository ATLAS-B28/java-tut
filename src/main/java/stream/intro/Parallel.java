package stream.intro;
import java.util.Arrays;
import java.util.List;
//allows parallelism
public class Parallel {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream()
                .filter(n -> n%2==0)
                .mapToInt(n -> n *2)
                .sum();
        System.out.println(sum);

    }
}

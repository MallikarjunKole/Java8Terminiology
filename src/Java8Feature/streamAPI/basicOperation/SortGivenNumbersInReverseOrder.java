package Java8Feature.streamAPI.basicOperation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortGivenNumbersInReverseOrder {
    public static void main(String[] args) {
        List<Integer> input = Stream.of(11,22,55,44,33,88,66,77,99)
                .collect(Collectors.toList());
        System.out.println("natural Order : ");
        input.stream().sorted().forEach(System.out::print);
        System.out.println("\nreverse Order : ");
        input.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);


    }
}

package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringOnTheirLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("EEEEE", "BB", "A", "DDDD", "CCC");
        input.stream().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}

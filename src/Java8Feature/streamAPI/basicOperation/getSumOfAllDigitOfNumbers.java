package Java8Feature.streamAPI.basicOperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class getSumOfAllDigitOfNumbers {
    public static void main(String[] args) {
        int input = 95123;

        Integer result = Stream.of(String.valueOf(input).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("Result : "+result);
    }
}

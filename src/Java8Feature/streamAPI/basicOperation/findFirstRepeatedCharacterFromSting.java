package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterFromSting {

    public static void main(String[] args) {

        String s = "Programming";

        Map<String, Long> resultMap = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("resultMap : "+resultMap);

        String repeatedChar = resultMap.entrySet().stream().filter(a -> a.getValue() > 1)
                .map(a -> a.getKey())
                .findFirst().get();

        System.out.println("First Repeated Char : "+repeatedChar);
    }
}

package Java8Feature.streamAPI.basicOperation;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetFrequencyOfEachCharacterFromString {
    public static void main(String[] args) {
        String s = "I Love My India";
        Map<Character, Long> map = s.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        System.out.println(map);
    }
}

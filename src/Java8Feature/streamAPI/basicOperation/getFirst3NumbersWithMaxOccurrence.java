package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class getFirst3NumbersWithMaxOccurrence {

    public static void main(String[] args) {

        List<Integer> numbers = Stream.of(1, 2, 3, 1, 2, 3, 1, 2, 5, 6, 7, 8, 7, 6, 5, 6,5,5,5)
                .collect(Collectors.toList());

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 5, 6, 7, 8, 7, 6, 5, 6);

        Map<Integer, Long> result = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        for(Map.Entry<Integer, Long> map : result.entrySet()){
            System.out.println("Key : "+map.getKey()+" Value : "+map.getValue());
        }

        List<Integer> finalResult = result.entrySet().stream()
                .filter(a -> a.getValue() > 1)
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(3).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Output : " + finalResult);



    }
}

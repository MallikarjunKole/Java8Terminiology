package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class getNonRepeatingNumbersFromArray {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1,2,3,4,5,1,2,3,6);
       Map<Integer, Long> map = input.stream()
               .collect(Collectors.groupingBy(Function.identity(),
                       Collectors.counting()));

       List<Integer> finalResultList = map.entrySet().stream().filter(a -> a.getValue() == 1)
               .map(Map.Entry::getKey).collect(Collectors.toList());

       System.out.println("Non repeated Numbers : "+finalResultList);
    }
}

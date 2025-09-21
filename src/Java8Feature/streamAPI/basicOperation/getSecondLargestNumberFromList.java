package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetSecondLargestNumberFromList {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(11,22,33,44,55);

       int res = input.stream().sorted(Comparator.reverseOrder())
               .skip(1).findFirst().get();
        System.out.println("Result : "+res);
    }
}

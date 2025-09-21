package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.List;

public class removeDuplicateElementsFromList {
    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1,2,3,4,3,0,2,1,7,8,9,1,0);
        inputNumbers.stream().distinct().forEach(System.out::println);
    }
}

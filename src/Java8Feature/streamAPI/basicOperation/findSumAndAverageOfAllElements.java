package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.List;

public class findSumAndAverageOfAllElements {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Sum of all elements : "+input.stream().mapToInt(Integer::intValue).sum());

        System.out.println("Avg of all elements : "+input.stream().mapToDouble(Integer::intValue).average());
    }
}

package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetMinMaxElementFromArray {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1,2,3,4,5);

        int min = input.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min Number : "+min);

        int max = input.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max Number : "+max);
    }
}

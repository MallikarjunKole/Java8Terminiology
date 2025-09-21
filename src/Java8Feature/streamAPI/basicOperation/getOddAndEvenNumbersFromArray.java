package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetOddAndEvenNumbersFromArray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,71,35,77,78,89,90,1,3,4,21,27,46);

        Map<Boolean,List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(a -> a % 2 ==0));

        for(Map.Entry<Boolean, List<Integer>> map : result.entrySet()){
            if(map.getKey()){
                System.out.println("Even Numbers : "+map.getValue());
            }else{
                System.out.println("Odd Numbers : "+map.getValue());
            }
        }
    }
}

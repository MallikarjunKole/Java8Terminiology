package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class getDuplicateElementsFromArray {

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(111,333,222,666,555,444,444,222,111);

        Set<Integer> set = new HashSet<>();

        Set<Integer> duplicateElements = inputList.stream().filter(a -> !set.add(a))
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements : "+duplicateElements);
    }
}

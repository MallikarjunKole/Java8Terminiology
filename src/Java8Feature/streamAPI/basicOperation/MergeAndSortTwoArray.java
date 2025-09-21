package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSortTwoArray {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        int [] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct().sorted().toArray();
        System.out.println(" Merged and Sorted Array : "+Arrays.toString(c));
    }
}

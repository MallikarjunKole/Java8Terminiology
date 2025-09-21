package Java8Feature.streamAPI.basicOperation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseEachWord {
    public static void main(String[] args) {

        String input = "I Love My India";

        String output = Arrays.stream(input.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Output : "+output);
    }
}

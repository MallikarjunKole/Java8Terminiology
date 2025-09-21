package Java8Feature.functionalInterface;

import java.util.*;
import java.util.function.*;

public class BuiltInFunctionalInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Arjun", "Sita", "Ram", "Anjali");

        // demo for predicate
        Predicate<String> predicate = name -> name.startsWith("R");
        names.stream().filter(predicate).forEach(System.out::println);

        // demo for function
        Function<String, Integer> function = a -> a.length();
        names.stream().map(function).forEach(a -> System.out.println("length : "+a));
        names.forEach(name -> System.out.println(name +" : "+function.apply(name)));

        // demo for consumer
        Consumer<String> consumer = a -> System.out.println("Hello, "+a);
        System.out.println("\nGreeting each person:");
        names.forEach(consumer);

        // demo for supplier
        Supplier<Double> suppiler = () -> Math.random();
        System.out.println("Suppiler : "+suppiler.get());
    }
}

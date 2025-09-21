package Java8Feature.completableFuture.creation;

import java.util.concurrent.CompletableFuture;

public class CompletedFuture {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture
                .completedFuture("Hello, World ..!");

        try {
            String result = completableFuture.get();
            System.out.println("Result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        completableFuture.thenApply(a -> a.toUpperCase())
                .thenAccept(a -> System.out.println("Final Result : "+a));
    }
}

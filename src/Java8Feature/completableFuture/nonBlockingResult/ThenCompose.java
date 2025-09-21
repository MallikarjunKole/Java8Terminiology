package Java8Feature.completableFuture.nonBlockingResult;

import java.util.concurrent.CompletableFuture;

public class ThenCompose {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Hello, ";
        });

        CompletableFuture<String> completableFuture2 = completableFuture1.thenCompose(result ->
                CompletableFuture.supplyAsync(() -> result + " There.!"));

        completableFuture2.thenAccept(res -> System.out.print("result : " + res));
        completableFuture2.join();
    }
}

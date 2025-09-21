package Java8Feature.completableFuture.completion;

import java.util.concurrent.CompletableFuture;

public class Complete {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                completableFuture.complete("Completed...!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        completableFuture.thenApply(res -> res.toUpperCase())
                .thenAccept(res -> System.out.println("Result : " + res));
        completableFuture.join();
    }
}

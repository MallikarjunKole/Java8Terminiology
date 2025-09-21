package Java8Feature.completableFuture.nonBlockingResult;

import java.util.concurrent.CompletableFuture;

public class ThenAccept {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Completed");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        completableFuture.thenAccept(res -> System.out.println(res));


    }
}

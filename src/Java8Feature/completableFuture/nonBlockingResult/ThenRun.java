package Java8Feature.completableFuture.nonBlockingResult;

import java.util.concurrent.CompletableFuture;

public class ThenRun {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "reponse string from sunAsync";
        });

        completableFuture.thenRun(() -> System.out.println("Final result"));
        completableFuture.join();
    }
}

package Java8Feature.completableFuture.nonBlockingResult;

import java.util.concurrent.CompletableFuture;

public class ThenCombine {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 10;
        });

        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 20;
        });

        CompletableFuture<Integer> result = completableFuture1.thenCombine(completableFuture2, (a, b) -> a + b);
        result.thenAccept(res -> System.out.println("Final Result : " + res));
        result.join();
    }


}

package Java8Feature.completableFuture.nonBlockingResult;

import java.util.concurrent.CompletableFuture;

public class ThenApply {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        completableFuture.complete("Dummy value inside Completable Future Object");
        completableFuture.thenApply(res -> res.toUpperCase())
                .thenAccept(res -> System.out.println(res));
    }
}

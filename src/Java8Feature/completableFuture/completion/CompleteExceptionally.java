package Java8Feature.completableFuture.completion;

import java.util.concurrent.CompletableFuture;

public class CompleteExceptionally {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = new CompletableFuture<>();


        new Thread(() -> {
            try {
                Thread.sleep(1000);
                completableFuture.completeExceptionally(new RuntimeException("Something went wrong"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        completableFuture.thenAccept(res -> System.out.println("Result " + res))
                .exceptionally(ex -> {
                    System.out.println("Exception Occurred : " + ex.getMessage());
                    return null;
                });
        completableFuture.join();
    }
}

package Java8Feature.completableFuture.creation;

import java.util.concurrent.CompletableFuture;

public class RunAsync {
    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Gets Completed asynchronously with runAsync...!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        completableFuture.thenRun(() -> System.out.println("Task Completed"));
        completableFuture.join();
    }
}

package Java8Feature.completableFuture.creation;

import java.util.concurrent.CompletableFuture;

public class SupplyAsync {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Hello from supplyAsync";
        });
        //join will throw run time exception
        System.out.println("Result : " + completableFuture.join());
        try {
            // get will throw compile time exception
            System.out.println("Result : " + completableFuture.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

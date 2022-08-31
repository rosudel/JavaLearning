package ComposingCompletableFutures;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args){
        //System.out.println("Hello world");
        var future = CompletableFuture.supplyAsync(() -> "email");
        future
                .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist"))
                .thenAccept(playlist -> System.out.println(playlist));
    }
}

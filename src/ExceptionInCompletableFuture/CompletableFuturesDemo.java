package ExceptionInCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void main(){
        var future = CompletableFuture.supplyAsync(() ->{
            System.out.println("Getting the current weather ");
            throw new IllegalStateException();
        });
    }
}

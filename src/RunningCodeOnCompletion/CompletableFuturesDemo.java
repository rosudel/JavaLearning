package RunningCodeOnCompletion;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void main(String[] args){
        var future = CompletableFuture.supplyAsync(() -> 1);
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

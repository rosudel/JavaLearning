package TransformingCompletableFuture;

import RunningCodeOnCompletion.CompletableFuturesDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static int toFahrenheit(int celsius){ //it can be used instead of Lampda expression
        return (int) (celsius*1.8)+32;
    }
    public static void main(String[] args){
        var future = CompletableFuture.supplyAsync(() -> 20);

        try {
            var result = future.thenApply(celsius -> (celsius*1.8) + 32).get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        // Or instead of try
        future.thenApply(CompletableFutureDemo:: toFahrenheit)
                .thenAccept(f -> System.out.println(f));


    }
}

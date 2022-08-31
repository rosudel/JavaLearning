package CombiningCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args){
        var first = CompletableFuture.supplyAsync(() -> 20); //return 20
        var second = CompletableFuture.supplyAsync(() -> 0.9);//return 0.9

        first.thenCombine(second, (price, exchangeRate) -> price*exchangeRate)
                .thenAccept(result-> System.out.println(result));// price = first, exchangeRate = second
    }
}

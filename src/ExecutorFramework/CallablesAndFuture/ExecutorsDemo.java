package ExecutorFramework.CallablesAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //System.out.println(executor.getClass().getName());


        //Best practice for above code
        try{
            var future = executor.submit(() -> {
                //System.out.println(Thread.currentThread().getName());
                LongTask.simulate();// don't wait for it
                return 1;
            });
            System.out.println("Do more task");
            var result = future.get();
            System.out.println(result);//it will be printed after 3 seconds
        }
        catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}

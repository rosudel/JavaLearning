
package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //System.out.println(executor.getClass().getName());

        //We submit a task without setting any specific thread. Just executor wil select the thread.
        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });


        //Now we are doing 10 tasks with 2 threads
        for(int i = 0; i < 10; i++){
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });


        }

        executor.shutdown();//exit the executor


        //Best practice for above code
        try{
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        finally {
            executor.shutdown();
        }
    }
}
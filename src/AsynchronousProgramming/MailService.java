package AsynchronousProgramming;

import ExecutorFramework.CallablesAndFuture.LongTask;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send(){
        LongTask.simulate();// delay 3s here
        System.out.println("Mail was sent");//then it print
    }

    public CompletableFuture<Void> sendAsync(){ //it makes the program asynchronous
        return CompletableFuture.runAsync(() -> send());
    }

}

package AsynchronousProgramming;

public class Main {
    public static void main(String[] args){
        var service = new MailService();
        //service.send();
        service.sendAsync();
        System.out.println("Hello world");

        try{
            Thread.sleep(4000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Ouput is asynchronous:
        /*
        Hello world
        Mail was sent
        */
    }
}

package AsynchronousProgramming;

public class Main {
    public static void main(String[] args){
        var service = new MailService();
        //service.send();
        service.sendAsync();
        System.out.println("Hello world");// as asynchronous so it will print

        try{
            Thread.sleep(4000);// wait sometimes before terminate. If more to execute
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

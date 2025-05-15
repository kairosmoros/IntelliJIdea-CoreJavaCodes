package Multithreading;
class jointest implements Runnable
{
    @Override
    public void run() {
        System.out.println("child thread is running ");
        System.out.println("still child thread is running");
        System.out.println("again child thread is only running");
    }
}
public class Joindemo
{
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new jointest(),"jointest");//here I am giving child thread ie Thread-0 my own wish name
        t.start();
        //NOTE THAT IN JOIN DEADLOCK MAY HAPPEN BECUASE IT WILL WAIT TILL CHILD COMPLETES WHAT IF CHILD IS ALSO WAITING
        //ON SOMEONE
       t.join();// main Thread waits for t to finish ie child Thread to finish
        //Thread.join() is a method that makes the calling thread(eg., the main thread) wait for the specified thread
        //(eg., the child thread to complete its execution before proceeding . This ensures the child thread finishes
        //before the main thread continues, providing a way to enforce a specific execution order
        //This is more reliable than yield() or sleep() for ensuring the child thread runs to completion first
        System.out.println("now the main thread is running");
        System.out.println("still the main is running");
        System.out.println("now also main is only running");
    }


}

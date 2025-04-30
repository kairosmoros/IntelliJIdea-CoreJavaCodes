package Multithreading;
class Sleep implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("child thread is running ");
        System.out.println("child thread is still running");
    }
}
public class sleepdemo
{
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new Sleep(),"sleepThread");//here instead of setname() we are directly giving the
        //child thread a name
        t.start();
        Thread.sleep(88);//Thread.sleep() forces the current thread(here main thread)  to pause execution for a specific amount of
        //time(in milliseconds), giving the other threads a chance to run. Unlike Thread.yield(), which is just a
        //suggestion to the scheduler, sleep() guarantees the thread will be inactive for at least the given duration,
        //assuming no interruptions
        System.out.println(Thread.currentThread().getName());
        System.out.println("main thread is now running" );
        System.out.println("main thread is still running");
    }
}

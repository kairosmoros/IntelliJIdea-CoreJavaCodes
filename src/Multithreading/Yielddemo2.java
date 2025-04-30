
package Multithreading;
class YieldTest3 implements Runnable
{
    @Override
    public void run() {
        {
            Thread.yield();//the main purpose of the Thread.yield() is to hint the JVM to pause the current thread(here main thread) and allow
            //other threads to run, however it doesn't guarantee that this thread will immediately pause and another thread
            //will immediately take over, instead it depends on scheduler
            System.out.println("child thread is running");
            System.out.println("child thread still running");
        }
    }
}
public class Yielddemo2
{
    public static void main(String[] args)
    {
        Thread t1= new Thread(new YieldTest1());
        Thread t2=new Thread(new YieldTest1());
        t1.start();
        t2.start();

        System.out.println("main Thread is running");
        System.out.println("main Thread is still running");
    }
}

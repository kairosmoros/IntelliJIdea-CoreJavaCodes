package Multithreading;

class ThreadTest extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(Thread.currentThread());
            System.out.println("child thread executing .....");
        }
    }
}
public class ThreadDemo
{
    public static void main(String[] args)
    {

        ThreadTest t1= new ThreadTest();//a thread object is created but sleeping
        t1.run();//just calls method in MAIN thread
       // t1.start();//this creates new thread and automatically call for the run()
        //after execution of t1.start(); the main thread doesn't wait it starts doing its own work parallely

        for(int i=0; i<5; i++)//jvm creates its own thread once you created yours and starts executing as and when it gets chance

        {
            System.out.println(Thread.currentThread());
            System.out.println("Main Thread is running....");
        }

//main thread runs everything inside the main and child thread(t1) runs everything inside the
// overriden run method
    }
}

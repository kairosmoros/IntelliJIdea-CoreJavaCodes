package Multithreading;
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Running in thread: " +Thread.currentThread().getName());

    }
}
public class ThreadDemo1
{
    public static void main(String[] args)
    {
        MyThread2 t1 = new MyThread2();
        System.out.println("Before calling start ()");
        t1.start();//starts a new thread(Thread-0)
        //also the start() method is defined in the thread class
        System.out.println("After calling start()");
    }
    // now after seeing the output one can realise that the code is running simultaneously like when you run many times
    // the output changes means more than one thread are running and this is nothin but multithreading
    // REMEMBER THE OUTPUT MAY VARY EACH TIME YOU RUN SINCE IT IS MULTITHREADING CONCEPT

}

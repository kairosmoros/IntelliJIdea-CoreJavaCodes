package Multithreading;
class Mythread extends Thread
{
    public void run()
    {
        System.out.println("Running in: " +Thread.currentThread().getName());
    }
}
public class ThreadTestDemo0
{
    public static void main(String[] args) {
        Mythread t1 = new Mythread();// thread object created yet sleeping
        //case 1: Start a new thread
        t1.run();//Hey JVM , who's running me right now
        // JVM replies :"main thread is"
        t1.start();
        //case 2: Call run() directly

    }
}

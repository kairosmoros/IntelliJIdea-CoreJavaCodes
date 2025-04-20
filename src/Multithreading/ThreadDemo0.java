package Multithreading;
class MyThread1 extends Thread
{

    @Override
    public void run() {

        System.out.println("Running in thread: " +Thread.currentThread().getName());
    }
}
public class ThreadDemo0
{
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        System.out.println("Before calling run()");
        t1.run();// main thread calls run() directly
        System.out.println("after calling run()");
    }
    //In this code if you see you will see that the code is running simultaneously which means when no new thred
    // is there then definetly the main thread is there and normal sequentially we will continue the code
    //so no multithreadin concept will be applicable
}

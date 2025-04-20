package Multithreading;
class MyThread3 extends Thread//Meaning MyThread3 can be used as a thread
{
    @Override
    public void run() {
        System.out.println("Inside run(), thread: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo2
{
    public static void main(String[] args) {
        MyThread3 t1= new MyThread3();
        // case1: t1.run()
        System.out.println("calling t1.run()");
        t1.run();//main Thread runs run()
        System.out.println("Finished t1.run()");
        //case2: t1.start()
        System.out.println("calling t1.start()");
        t1.start();//new thread (Thread-0) runs run()
        System.out.println("Finished t1.start()");

    }
}

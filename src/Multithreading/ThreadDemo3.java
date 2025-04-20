package Multithreading;
class MyThread4 implements Runnable
{
    @Override
    public void run() {
        for(int i=0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("child thread " );
        }
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread4());//instead of giving object I am directly giving reference of MyThread class
        t.setName("Prashant");
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("main thread ");
        }
    }
}

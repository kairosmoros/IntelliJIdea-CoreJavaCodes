package Multithreading;
class sleeptest1 implements Runnable
{
    @Override
    public void run() {
        for(int i=0; i<3; i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
            System.out.println("now the child Thread is running");
        }
    }
}
public class sleepdemo2
{
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new sleeptest1(),"SleepThread");
        t.start();
        for (int i=0; i<3;i++)
        {
            Thread.sleep(55);
            System.out.println("now the main thread is running");
        }

    }
}

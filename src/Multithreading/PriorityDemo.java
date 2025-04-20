package Multithreading;
class PriorityTest implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Child Thread ");
        }
    }
}
public class PriorityDemo
{
    public static void main(String[] args)
    {

        Thread t1 = new Thread(new PriorityTest(), "Thread1");//Here we are running three threads t1,t2 and main Thread
        Thread t2 = new Thread(new PriorityTest(), "Thread2");
        t1.setPriority(1);// this priority is number is from 1 to 10 higher the number higher the priority
        //Note that Priority is not obsolute sometimes it may run before thread 2 or main though the priority of it is less compared to other threads
        System.out.println("t1's Priority: " +t1.getPriority());
        System.out.println("t2's Priority: " +t2.getPriority());
        t1.start();
        t2.start();
        for(int i=0; i<3; i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Main Thread ");
        }
//       System.out.println("t1's Priority: " +t1.getPriority());
//        System.out.println("t2's Priority: " +t2.getPriority());


    }
}

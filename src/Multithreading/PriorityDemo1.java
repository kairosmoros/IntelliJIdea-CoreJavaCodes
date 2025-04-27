package Multithreading;

public class PriorityDemo1
{
    public static void main(String[] args)
    {
        Thread thread1= new Thread(new MyRunnable1(), "Thread 1");
        Thread thread2= new Thread(new MyRunnable1(), "Thread 2");
        //Setting priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY);//Minimum Priority
        thread2.setPriority(Thread.MAX_PRIORITY);//Maximum Priority
        //Start the threads
        thread1.start();
        thread2.start();
    }
    static class MyRunnable1 implements Runnable
    {
        @Override
        public void run()
        {
            Thread thread = Thread.currentThread();
            System.out.println("Thread: " +thread.getName() + ", Priority: " +thread.getPriority());
        }
    }
}

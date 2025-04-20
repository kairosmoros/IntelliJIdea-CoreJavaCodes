package Multithreading;
class counter3 {
    private int count = 0;

    public synchronized void incre()//The incre() method is synchronized , ensuring thread safety, Only one thread can
            //increment count at a time, preventing race conditions
    {
        count++;
    }

    public int getCount()//it returns the current value of count since count is private so can't be accessed outside the
            //class so we need getCount()
    {
        return count;
    }
}
class CounterThread1 extends Thread//meaning CounterThread can be used as a Thread
{
    private counter3 counter;//private instance variable
    CounterThread1(counter3 counter)//a constructor that takes a counter object and stores it in an instance variable
    {
        this.counter=counter;
    }

    @Override
    public void run() //now the Thread class run is being overriden by Multithread class run()
            //It contains the code to be executed by the thread. It calls counter.incre() 5 times
    {
        for (int i=0; i<5; i++)
        {
            counter.incre();
        }
    }
}
public class countertest1
{
    public static void main(String[] args) throws InterruptedException {
        counter3 c= new counter3();//counter object 'c' is created
        Thread t1= new CounterThread1(c);//CounterThread object t1 is created , sharing counter instance with t2
        //IF CONFUSED THEN GO TO OOPS INHERITANCEDEMO.JAVA IN THE FILE
        Thread t2= new CounterThread1(c);//CounterThread object t2 is created , sharing counter instance with t1
        t1.start();
        //t1.start() and t2.start() launch the threads, which execute the run() method concurrently
        t2.start();
        Thread.sleep(4);
        System.out.println("final count = " +c.getCount());//prints the value after the threads are started


    }
}



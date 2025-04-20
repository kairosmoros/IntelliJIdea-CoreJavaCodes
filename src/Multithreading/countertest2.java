package Multithreading;

class counter {
    private int count = 0;

    // Constructor with print statement to show execution
    public counter() {
        System.out.println("counter constructor called");
    }

    public  synchronized void incre() //Here I have used synchronised so that only one thread can access it at a time
            //and also the data inconsistency will not be there.
            /* 1. Mutual Exclusion (ME): Only one thread can execute the synchronized block or method at a time, preventing
multiple threads from accessing the shared resource simultaneously.
2. Eliminates Race Conditions: By restricting access to one thread, it prevents race conditions where threads
compete to modify shared data, leading to unpredictable results.
3. Prevents Data Inconsistency: Since only one thread can modify the shared resource at a time, the data remains
consistent and correct.
When a thread enters a synchronized block or method, it acquires a lock (on the object or class), and no other thread
 can enter that critical section until the first thread completes and releases the lock. Other threads wait in a queue
  until the lock is available.*/
    {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private counter counter;

    // Constructor with print statement to show execution
    public CounterThread(counter counter)//it is like (int a ) but here we have created for class counter therefore (counter counter)
    {
        this.counter = counter;
        System.out.println("CounterThread constructor called for " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            counter.incre();
            try {
                Thread.sleep(10); // Small delay to observe thread interleaving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished, count = " + counter.getCount());
    }
}

public class countertest2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Scenario 1: Shared Counter ===");
        // Scenario 1: Both threads share the same counter
        counter sharedCounter = new counter();
        CounterThread t1 = new CounterThread(sharedCounter);//you can also use Thread t1=new CounterThread(sharedCounter);[for clarity check the inheritance demo
        CounterThread t2 = new CounterThread(sharedCounter);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count (shared) = " + sharedCounter.getCount());

        System.out.println("\n=== Scenario 2: Separate Counters ===");
        // Scenario 2: Each thread has its own counter
        counter counter1 = new counter();
        counter counter2 = new counter();
        CounterThread t3 = new CounterThread(counter1);
        CounterThread t4 = new CounterThread(counter2);
        t3.setName("Thread-3");
        t4.setName("Thread-4");
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("t3 count (separate) = " + counter1.getCount());
        System.out.println("t4 count (separate) = " + counter2.getCount());
    }
}
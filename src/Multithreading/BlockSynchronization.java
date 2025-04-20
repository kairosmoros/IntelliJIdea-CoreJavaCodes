/* FOR CLARITY READ THIS DOCUMENTATION FIRST AND I HAVE MADE A CODE ON IT IN THE BlockSynchronization1.java class THANKS
Real-Life Example: A Shared Bank Vault
Imagine a bank vault where only one person can access the safe deposit boxes at a time to avoid confusion or theft. Here’s how it relates to your code:

The Vault (Object b): The vault is like the ThreadB instance b. It contains valuable items (the instance variable total), and multiple people (threads) want to interact with it.
        The Manager (Main Thread): The bank manager (main thread) wants to check the total value in the vault but needs to wait until the accountant (Thread-0) finishes updating it.
        The Accountant (Thread-0): The accountant (the thread started by b.start()) is calculating the new total by adding up deposits (the loop in run).
Why synchronized(b) in main?
The manager locks the vault door with synchronized(b) and says, “I’m going to wait here until the accountant is done.” This is the b.wait() call. The lock ensures no one else (another thread) can barge in while the manager is waiting.
In real life, this is like the manager standing at the vault door, holding the key (b), and waiting for the accountant to finish before opening it to count the money.
        Why synchronized(this) in ThreadB?
        The accountant, inside the vault, also locks the door with synchronized(this) (where this is the same vault b) to safely update the total. This prevents anyone else from entering while they’re adding up the deposits.
        Once done, the accountant unlocks the door and signals the manager with this.notify(), saying, “I’m finished—come check now!”
How They Work Together
Both the manager and accountant use the same vault door key (b or this, which are the same object). The synchronized blocks ensure only one person can hold the key at a time.
The manager waits patiently outside (b.wait()), and the accountant works inside (synchronized(this)). When the accountant finishes and notifies (this.notify()), the manager can enter, lock the door again (synchronized(b)), and see the final total.


*/

package Multithreading;
public class BlockSynchronization {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();//When ThreadB b = new ThreadB() is executed, b is an instance of ThreadB, and it has its own total instance variable which is total in this case.

        /*1. b is an instance/object(since it was created with the keyword new) so ThreadB b = new
        ThreadB(); creates an instance of ThreadB. The instance b has its own total instance variable.
        SO b IS AN INSTANCE, AND total IS THE INSTANCE VARIABLE THAT b CONTAINS.
        /*
        /* 2. b is both an object (with its own instance variables like total) and a thread
         because it inherits Thread’s behavior. This dual nature can be confusing, but it’s a key feature of extending
         Thread*/

        b.start();//b.start() starts a new thread that runs ThreadB’s run method. Inside run,synchronized(this) locks on the b instance. This ensures that the loop updating total (e.g., total = total + i) is executed by only one thread at a time for that b object.

        synchronized (b)//In main, synchronized(b) locks on the same b instance, allowing the main thread to wait until b.notify() is called, ensuring the main thread sees the final total value.

        /*3. synchronized(b) in main
In the main method, you have synchronized (b) { ... }. Here, b is an instance of ThreadB, which extends Thread. The
synchronized keyword locks on the object reference b, meaning only one thread can execute the code inside this block
while holding the lock on b.
Inside this block, b.wait() is called, which causes the main thread to pause and release the lock on b until another
thread calls notify() or notifyAll() on the same object (b).
The purpose here is to make the main thread wait until ThreadB completes its calculation and notifies it. Since b is
 the ThreadB instance, this synchronization ensures the main thread waits for ThreadB’s task to finish.

 */

        {
            System.out.println("Main thread is wating for calculation ");
            b.wait();
            System.out.println("Main Thread got notified ");
            System.out.println("total is = " + b.total);
        }
    }
}

    class ThreadB extends Thread
    {
        int total=0;//instance variable
        @Override
        public void run()
        {
            synchronized (this)

                /*The this keyword inside a method (like run in ThreadB) always refers to the current
      instance of the class where it’s used. In this case, this inside ThreadB’s run method refers to the specific
 ThreadB object that is executing the run method—in your code, that’s the object b created by ThreadB b = new ThreadB().
this does not directly point to an instance variable like total. Instead, it points to the entire instance (the object),
 and you can use this to access its instance variables or methods (e.g., this.total). However, by itself, this is the
 object, not the variable. */

            {
                System.out.println("child thread starts calculation ");
                for(int i=0; i<10; i++)
                {
                    total=total+i;
                    System.out.println("child thread ");
                }
                System.out.println("child thread giving notification call " +total);
                this.notify();//or you can use this.notifyAll(); too.
            }

        }
    }


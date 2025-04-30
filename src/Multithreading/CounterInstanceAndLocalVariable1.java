package Multithreading;
class SharedData {
    int sharedInstanceVar = 0; // Instance variable in SharedData

    void  increment() {
        sharedInstanceVar++;
        System.out.println(Thread.currentThread().getName() + " - sharedInstanceVar: " + sharedInstanceVar);
    }
}

class MyThread5 extends Thread {
    SharedData sharedData; //an instance variable of class MyThread5 and Reference to shared object( meaning behaves as instance and reference variable too)
    /* 1.The line SharedData sharedData; declares a variable named sharedData of type SharedData. This is a reference variable, meaning it holds a reference (or memory address) to an object of the SharedData class (data). In your code, this reference will point to the data object created in the main method (SharedData data = new SharedData()).
    *  2.The comment // reference to shared object indicates that sharedData is intended to refer to a SharedData object that multiple threads (e.g., thread1 and thread2) will share. This is key to understanding the multithreading aspect—both MyThread5 instances (thread1 and thread2) use the same SharedData object (data), so changes to sharedInstanceVar by one thread affect what the other thread sees.
    *  3.In MyThread5, sharedData is an instance variable that starts as null (the default for object references).
    *  4.The constructor MyThread5(String name, SharedData sharedData) assigns the sharedData parameter to the instance variable this.sharedData, linking each MyThread5 instance to the same SharedData object (data).
    *  5.When thread1 and thread2 call sharedData.increment(), they’re both operating on the same SharedData object’s sharedInstanceVar, which is why the final value reflects all increments (e.g., 4 if each thread increments twice).
    *  */

    MyThread5(String name, SharedData sharedData) {
      //  super(name);//this sets the name of threads , I mean string name
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            sharedData.increment();
        }
    }
}

public class CounterInstanceAndLocalVariable1 {
    public static void main(String[] args) throws Exception{
        SharedData data = new SharedData(); // One shared object
        MyThread5 thread1 = new MyThread5("Thread-1", data);
        MyThread5 thread2 = new MyThread5("Thread-2", data);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Final sharedInstanceVar: " + data.sharedInstanceVar);
    }
}
//OUT PUT IS DIFFERING BECAUSE WE DON'T KNOW AT WHAT TIME AFTER PREMPTION DIFFERENT THREADS GET THEIR CHANCE AS IN THIS
//CASE WHEN THREAD 0 ALREADY INCREMENTED IT TO 2 SUDDENLY THREAD 1 GOT THE CHANCE BUT ONLY TO SHOW THE PREVIOUS VALUE
// WHICH WAS INCREMENTED BY THREAD-0 ALREADY
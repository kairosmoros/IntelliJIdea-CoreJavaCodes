


import java.util.concurrent.ExecutionException;

class MyThread extends Thread {
    int instanceVar = 10; // Instance variable unique to each Thread object

    MyThread(String name) {
        super(name); // Set thread name
    }

    synchronized void showValue() {
        System.out.println(getName() + " - InstanceVar: " + instanceVar);
    }

    synchronized void modifyValue(int newValue) {
        instanceVar = newValue;
    }

    @Override
    public void run() {
        showValue(); // Show initial value
        modifyValue(20); // Modify instanceVar
        showValue(); // Show modified value
    }
}

public class CounterInstanceAndLocalVariable {
    public static void main(String[] args) throws Exception {
        MyThread thread1 = new MyThread("Thread-1"); // First Thread object
        MyThread thread2 = new MyThread("Thread-2"); // Second Thread object

        thread1.start(); // Start thread1
        thread2.start(); // Start thread
        try {
            Thread.sleep(100); //main Wait briefly(around 100 ms)  to allow threads to finish
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted during sleep: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restore interrupted status
        }

        System.out.println("Main thread exiting.");

    }
    // Note: main waits briefly to let threads finish (guaranteed if no interrupts occur in between then definetly that much time main will wait)


}
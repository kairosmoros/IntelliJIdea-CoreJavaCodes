package Multithreading;
class MyThread extends Thread {
    int instanceVar = 10; // Instance variable unique to each Thread object

    MyThread(String name) {
        super(name); // Set thread name
    }

    void showValue() {
        System.out.println(getName() + " - InstanceVar: " + instanceVar);
    }

    void modifyValue(int newValue) {
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
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1"); // First Thread object
        MyThread thread2 = new MyThread("Thread-2"); // Second Thread object

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        // Note: main waits briefly to let threads finish (not guaranteed)
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
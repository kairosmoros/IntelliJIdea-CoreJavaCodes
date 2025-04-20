/* BY DEFAULT RUNNABLE KA HI USE HOTA HAI , EVETHOUGH HUM EXTEND SE BHI MULTITHREADING KARTE HAI
LEKIN WO BHI INTERNALLY RUNNABLE KO HI USE KARTA HAI
 */
package Multithreading;
class MyRunnable implements Runnable//runnable is just an interface it doesn't have a start method, start method is in Thread class
{
    @Override
    public void run() {
        for( int i=0; i<5; i++)
        {
        System.out.println("inside run thread: a" +Thread.currentThread().getName());
        }

    }
}

public class ThreadImplementation0
{
    public static void main(String[] args) {
        MyRunnable t1= new MyRunnable();//creates an instance of MyRunnable with the run() logic
        System.out.println("before creating a thread object");
        Thread r= new Thread(t1);//The start method is defined in the thread class
        //Thread(t1) calling the constructor Thread(Runnable Target) like this many are there but right
        //now we have hit it and internally it is working which is abstract for us
        //creates a Thread object(r) and associates it with t1's run() method
        System.out.println("after creating a thread object");
        r.start();//starts a new thread(r), which executes t1.run() in that thread.
        System.out.println("after calling the r.start()");
    }
}

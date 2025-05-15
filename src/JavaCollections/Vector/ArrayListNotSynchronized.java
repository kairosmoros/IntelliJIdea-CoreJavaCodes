package JavaCollections.Vector;
/* ArrayList is not synchronized: We get odd results when we try to add elements into ArrayList from multiple threads.
Although we can synchronize it as we did in MultiThreading go and watch the code.
Where as vector is by default Synchronized but the problem is it is slow compare to ArrayList
 */
import java.util.*;
class Test
{
    static ArrayList<Integer> list= new ArrayList<>();//here this is static variable means it is not for a particular object/instance rather
    // it is for the class and it is shared among all the instances and can be accessed from any class without object creation by just Test.list.

}
class First extends Thread
{
    public void run()
    {
        for(int i=1; i<=100000; i++)
        {
            Test.list.add(i);
        }
    }
}
class Second extends Thread
{
    public void run()
    {
        for(int i=1; i<=100000;i++)
        {
            Test.list.add(i);
        }
    }
}
public class ArrayListNotSynchronized
{
    public static void main(String[] args) throws InterruptedException {
        First f=new First();
        Second s=new Second();
        f.start();
        s.start();
        f.join();
        s.join();
        System.out.println("List size is : " +Test.list.size());
    }

}

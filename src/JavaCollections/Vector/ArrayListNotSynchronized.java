package JavaCollections.Vector;
/* ArrayList is not synchronized: We get odd results when we try to add elements into ArrayList from multiple threads.

 */
import java.util.*;
class Test
{
    static ArrayList<Integer> list= new ArrayList<>();
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

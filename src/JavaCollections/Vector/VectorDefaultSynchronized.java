package JavaCollections.Vector;
/*
Vector is thread safe, hence we get perfect results when we try to add elements from multiple threads.
 */
import java.lang.management.RuntimeMXBean;
import java.util.*;
class Test1
{
    static Vector<Integer> list= new Vector <Integer>();
}
class First1 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1; i<=100000; i++)
        {
            Test1.list.add(i);
        }
    }
}
class Second1 implements Runnable
{
    @Override
    public void run()
    {
     for(int i=1; i<=100000; i++)
     {
         Test1.list.add(i);
     }
    }
}
public class VectorDefaultSynchronized
{
    public static void main(String[] args) throws InterruptedException {
       Thread f= new Thread(new First1(), "Thread first");
        Thread s1= new Thread(new Second1() , "Thread second");
        f.start();
        s1.start();
        f.join();
        s1.join();
        System.out.println("Vector size is : " +Test1.list.size());


    }

}
/* We can also code like this
import	java.util.*;
class Test
{
static Vector<Integer> list = new Vector<Integer>();
}
class First extends Thread
{
public void run(){
for (int i=1 ; i<=100000 ; i++)
{
Test.list.add(i);
}
}
}
class Second extends Thread
{
public void run(){
for (int i=1 ; i<=100000 ; i++)
{
Test.list.add(i);
}
}
}
class Code
{
public static void main(String[] args) throws Exception
{
First	f	=	new	First();
Second	s	=	new	Second();
f.start();
s.start();
f.join();
s.join();
System.out.println("Vector size is :" + Test.list.size());
}
}
 */
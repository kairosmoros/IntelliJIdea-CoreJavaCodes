package Multithreading;
class demotest1 implements Runnable
{
    static int sum=0;
    @Override
    public void run() {

        for (int i=0; i<3; i++)
        {

            sum +=i;//0+0+1+2=3
        }
    }
}
public class Joindemo1
{
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new demotest1(),"sum");//Here I have given the thread name as sum
        t.start();
        t.join();//now without it the output will be 0 or say not consistent result but after giving join it will give
        //the correct output as 3
        System.out.println("sum is: " +demotest1.sum);
    }
}

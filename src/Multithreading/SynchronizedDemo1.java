package Multithreading;
class SavingAccounts1
{
    public synchronized void  withdraw1(String name) throws InterruptedException
{
    for (int i=0; i<5 ; i++)
    {
        System.out.println();//for gap of a line in the output
        System.out.println("Paise ab nikal rhe hain ");
        Thread.sleep(1000);//this just to delay the output so that one can see how the code is running
        System.out.println(name);
    }
    System.out.println(" ");
    System.out.println("Transaction for ****** " + name+ " ****** is completed ");
}
}
class MyThread9 extends Thread
{
    String name;
    SavingAccounts1 s1;
    MyThread9(String name , SavingAccounts1 s1)
    {
        this.name=name;
        this.s1=s1;
    }

    @Override
    public void run()
    {
        try {
            s1.withdraw1(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SynchronizedDemo1
{
    public static void main(String[] args) throws InterruptedException {
        SavingAccounts1 s= new SavingAccounts1();
        MyThread9 t1 = new MyThread9("Pati" ,s);
        MyThread9 t2= new MyThread9("Patni" , s);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("  ");
        System.out.println("now since transaction completed you both ie; "+t1.name+ "  and " + t2.name +" can go home");


    }
}




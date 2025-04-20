package Multithreading;
class SavingAccount
{
public void withdraw(String name) throws InterruptedException//Here in the critical section I have not used the term
        //Synchronized so in the critical section both the threads are coming at a time which is violating mutual
        //exclusion , race condition (lost update ) and going into critical section together causing data inconsistency
{
    for(int i=0; i<5; i++)
    {
        System.out.println("Paise ab nikal rahe hain ");
        Thread.sleep(1000);
        System.out.println(name);
    }


}
}
class MyThreadAccount extends Thread
{
    String name;
    SavingAccount s;
    MyThreadAccount(SavingAccount s, String name)
    {
        this.s=s;
        this.name=name;
    }

    @Override
    public void run()
    {
        try {
            s.withdraw(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
public class SynchronizedDemo
{
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        MyThreadAccount t1= new MyThreadAccount(savingAccount, "pati");
        MyThreadAccount t2= new MyThreadAccount (savingAccount, "patni");
        t1.start();
        t2.start();
    }
}

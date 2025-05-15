package Multithreading;
class SBI extends Thread
{
     double money=0;   //this is the valuable things manager and accountant are fearing that what if other staffs will read problem will arise that till now we have no counted it or if some costumer add some money to it then counting job will increase and it will increase the time of us counting

    @Override
    public void run()
    {
        //System.out.println("Accountant is trying to calculate as fast as possible yet its taking time ");
        //System.out.println("let me lock the vault with the key synchronized(this) first so that I can calculate it without hindrance ");
        synchronized(this)
        {
            for (int i=0; i<4; i++)
            {
                money = Math.pow(i,i);//if you write here double money= Math.pow(i,i); it will become like new local variable named money and original instance variable double money will not be updated
                System.out.println("the total money for " +i + " hours  is " +money);

            }
            System.out.println(" the total money for today's transaction calculated by accountant is " +money);

            this.notify();
        }
    }
}

public class BlockSynchronizatioin1
{
    public static void main(String[] args) throws InterruptedException {

        SBI vault = new SBI();
        vault.start();
        System.out.println("Manager is willing to upload the today's total money(transaction value which is the asset they are protecting from others) ");
        System.out.println("but fearing that if some other officials of this bank sees it then they will report it to higher authority for delay work");
        System.out.println("so lets lock the vault now and the key of it is synchronized(vault) ");
        synchronized (vault)
        {
            System.out.println("here I am now but the Accountant said It will take some time to count money so let me wait by vault.wait() command ");
            System.out.println("definitely he needs to notify me when he has counted it so he will notify me with command (this.notify) and after that I will upload the total money ");
            vault.wait(100);
            System.out.println("now Accountant(thread-0) has notified me so here is the uploaded amount and the total amount uploaded by manager(main) is: " +vault.money);
        }


        System.out.println("************************  today's Job is  done  ***************************");
    }

}

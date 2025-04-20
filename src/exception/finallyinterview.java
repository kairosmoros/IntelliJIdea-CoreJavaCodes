package exception;
class demo
{
    void m1()
    {
        try
        {

            System.out.println("try block is executed");
            return;

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("catch block executed");
        }
        finally//no matter what the finally block will be executed
        {
            System.out.println("finally block executed");
        }
    }
}
 public class finallyinterview
 {
     public static void main(String[] args) {
         demo d2= new demo();
         d2.m1();
     }
 }

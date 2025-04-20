package exception;
class demo1
{
    int m1()
    {
        try
        {

            System.out.println("try block is executed");
            return 20;

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("catch block executed");
        }
        finally//no matter what the finally block will be executed
        {
            System.out.println("finally block executed");
            return 90;
        }
    }
}
public class finallyinterview2 {
    public static void main(String[] args)
    {
        demo1 d2 = new demo1();
        System.out.println(d2.m1());
    }
}

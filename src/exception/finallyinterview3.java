package exception;
class demo2
{
    int m1()
    {
        try
        {
            System.out.println(10/0);
            System.out.println("try block is executed");
            return 20;

        }
        catch (ArithmeticException e)
        {
            System.out.println("catch block executed");
            System.out.println(e.getMessage());
            return 99;
        }
        finally//no matter what the finally block will be executed
        {
            System.out.println("finally block executed");

        }
    }
}
public class finallyinterview3 {
    public static void main(String[] args)
    {
        demo2 d2 = new demo2();
        System.out.println(d2.m1());
    }
}

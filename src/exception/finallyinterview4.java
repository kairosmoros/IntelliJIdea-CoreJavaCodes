package exception;
class demo3
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
            System.exit(0);//it shutdown the jvm and stops the code right here
            //without executing the final code
            return 00;

        }
        finally//no matter what the finally block will be executed
        {
            System.out.println("finally block executed");
            return 90;
        }
    }
}
public class finallyinterview4 {
    public static void main(String[] args)
    {
        demo3 d1 = new demo3();
        System.out.println(d1.m1());
    }
}

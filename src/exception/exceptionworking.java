package exception;

public class exceptionworking
{
    void print1()
    {
        print2();
        System.out.println("1");
    }
    void print2()
    {
        print3();
        System.out.println("2");
    }
    void print3()
    {
        print4();
        System.out.println("3");
    }
    void print4()
    {
        print5();
        System.out.println("4");
    }
    void print5()
    {
        System.out.println(10/0);
        System.out.println("5");
    }
}
class workingTest
{
    public static void main(String[] args)
    {
        exceptionworking w1= new exceptionworking();
        w1.print1();//stack formation will happen and error will be given by jvm , first it will ask to print5() that do you have the exception handling
        //code then it will say no then it will abnormally terminate it and next it will goes to print4() and so on so forth everything will be terminated
    }
}

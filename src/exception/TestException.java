package exception;
import java.io.FileReader;

public class TestException {
    public static void main(String[] args) {
        System.out.println("before try");
        try
        {
            System.out.println("before risky code");
            System.out.println(10/0);//risky code//here the code terminates and stops execution and goes to catch block
            System.out.println("After risky code");
        }
        catch (Exception e)//now when exception is thrown then this parent exception will hold its child object of type java.lang.ArithmeticException
        {
            System.out.println("in catch block");
            e.printStackTrace();//this is to print the type of error message
            System.out.println(e.toString());//different types of message writing for the same error
            System.out.println(e.getMessage());//message for the error
        }
        System.out.println("Prashant");
        System.out.println("Ratan");
    }
}
// java.lang.RuntimeException(baap) → java.lang.Exception(great baap)→ java.lang.Throwable(great great baap) → java.lang.Object(sabka baap)
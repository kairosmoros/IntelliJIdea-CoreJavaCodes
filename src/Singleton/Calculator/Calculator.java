package Singleton.Calculator;

public class Calculator
{
    // Single instance
    private static Calculator instance;

    // Private constructor to stop outside creation
    private Calculator()
    {
        System.out.println("Calculator instance created!");
    }

    // Public method to get the only instance

    public static Calculator getInstance()
    {
        if(instance==null)
        {
            instance = new Calculator();
        }
        return instance;
    }


    // Method to perform addition
     public int add(int a, int b)
     {
         return a+b;
     }

}

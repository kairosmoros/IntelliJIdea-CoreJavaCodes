package Singleton.Calculator1;

public class Calculator
{
    // Single instance
    private static Calculator instance;

    // Private constructor to stop outside creation
    private Calculator()
    {
        System.out.println("Calculator instance created!");
    }

    // private static Calculator Instance = new Calculator(); ( It is called eager Instantiation) ie, without calling also object gets created.



    // Public method to get the only instance

    public static Calculator getInstance()
    {
        if(instance==null)
        {
            instance = new Calculator();// Lazy Instantiation( creating an object )
            // lazy because object created when it is  called else not.
        }
        return instance;
    }


    // Method to perform addition
    public int add(int a, int b)
    {
        return a+b;
    }

}

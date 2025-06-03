package Singleton;

public class Singleton1
{
    // Create one object only (but don't create it yet)
    private static Singleton1 instance;

    // Private constructor to stop others from creating objects
    private Singleton1()
    {

    }

    // Public method to provide access to the only object
    public static Singleton1 getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton1();//Create only once
        }
        return instance;
    }
    public void showMessage()
    {
        System.out.println(" I am Singleton1 object. ");
    }
}
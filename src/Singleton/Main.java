package Singleton;

public class Main
{
    public static void main(String[] args) {
        // Get the single object

        Singleton1 s1=Singleton1.getInstance();
        Singleton1 s2=Singleton1.getInstance();
        s1.showMessage();
        // Check if both references point to the same object
        if(s1==s2)
        {
            System.out.println("Both are same object");
        }
        else
        {
            System.out.println("Different objects");
        }
    }
}

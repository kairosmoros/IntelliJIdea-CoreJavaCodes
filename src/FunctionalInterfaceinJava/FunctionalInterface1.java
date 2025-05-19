package FunctionalInterfaceinJava;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface First
{
    static void m1()
    {
        System.out.println("Static Method");
    }
    default void m2()
    {
        System.out.println("Default method");
    }
    void m3();//abstract
}
class Second implements First
{
    public void m3()
    {
        System.out.println("Instance method(method which can be called only with the help of creating object not like" +
                " static which is called directly by classname.method)  or abstract method");
    }
}
public class FunctionalInterface1
{
    public static void main(String[] args) {
        First obj=new Second();
        First.m1();
        obj.m2();
        obj.m3();
    }
}

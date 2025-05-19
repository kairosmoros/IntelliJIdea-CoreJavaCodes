package MethodReference.java;
@FunctionalInterface
interface Test
{
    void abc();
}
class Demo
{
    static void fun()
    {
        System.out.println("fun...");
    }
}
public class MethodReferenceStatic
{
    public static void main(String[] args) {
        Test obj=Demo::fun;
        obj.abc();
    }
}

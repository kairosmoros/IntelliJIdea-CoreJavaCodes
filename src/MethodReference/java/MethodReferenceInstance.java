package MethodReference.java;
@FunctionalInterface
interface Test1
{
    void abc();
}
class Demo1
{
    void fun()
    {
        System.out.println("fun1....");
    }

}
public class MethodReferenceInstance
{
    public static void main(String[] args) {
        Test obj=new Demo1()::fun;
        obj.abc();
    }
}

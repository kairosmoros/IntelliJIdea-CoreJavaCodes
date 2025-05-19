package MethodReference.java;

@FunctionalInterface
interface Sayable {
    void say();
}

public class MethodReference1
{
    public static void speak() {
        System.out.println("Hello from method reference!");
    }
    public static void main(String[] args)
    {
        Sayable obj = MethodReference1::speak;  // ✅ Method reference to static method
        obj.say();                  // ✅ Calls Demo.speak()
    }
}
// OR CAN WRITE BELOW HOW THE CODE IS WRITTEN
/*
class Demo {
    public static void speak() {
        System.out.println("Hello from method reference!");
    }
}
    public class MethodReference1
    {
        public static void main(String[] args)
        {
            Sayable obj = Demo::speak;  // ✅ Method reference to static method
            obj.say();                  // ✅ Calls Demo.speak()
        }
    }*/



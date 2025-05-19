package StaticAndDefaultMethodInterfaceJDK8;
/*
   Interface (JDK8 onwards)
   to instantiate class or interface means (creating object of class or interface).
   NOTE: Interfaces in Java cannot be instantiated(creating object of interface) directly, regardless of
   whether they contain abstract, default , or static methods. Objects can only be created from classes that implement
   the interface. While default methods are accessed through implementing class objects, static methods are accessed
   using the interface name.
   1. Interface allowed to define static methods from jdk8.
   2. Static methods can be accessed using identity of interface.
   ie.; Static methods: Called via interface name.
        default methods: Called via implementing class objects.
 */
interface CreditCard
{
    String carType="VISA-Platinum";//Variable is still static,final and public.
    static void benefits()
    {
        System.out.println("Benefits are Flying, Diving and more ");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        //Correct way to call static method in interface
        CreditCard.benefits();
        System.out.println(CreditCard.carType);
    }
}

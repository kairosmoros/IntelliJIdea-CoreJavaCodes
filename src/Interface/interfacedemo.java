package Interface;
//WE CAN'T MAKE OBJECT FOR THE INTERFACE
/* to instantiate class or interface means (creating object of class or interface).
NOTE: Interfaces in Java cannot be instantiated(creating object of interface) directly, regardless of
whether they contain abstract, default , or static methods. Objects can only be created from classes that implement
the interface. While default methods are accessed through implementing class objects, static methods are accessed
using the interface name.
 */
public class interfacedemo
{
    public static void main(String[] args) {
        Animal doggy= new dog();//upcasting the interface type
        doggy.sound();
    }

}
interface Animal
{
    int a=20; // by default the objects of the interface are static , public and final
     void sound();// by default the methods of the interface are public and abstract
}
class dog implements Animal
{
    public void sound()
    {
        System.out.println("woof!");
    }
}
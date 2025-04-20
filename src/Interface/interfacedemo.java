package Interface;
//WE CAN'T MAKE OBJECT FOR THE INTERFACE
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
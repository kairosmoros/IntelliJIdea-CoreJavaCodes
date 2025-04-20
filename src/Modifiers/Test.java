package Modifiers;

class ModifierDefault //accessbility within the same package
{
    String name= "Prashant";//default modifier
    void display()//default modifier
    {
        System.out.println("Hello "+name);
    }
}
public class Test
{


    public static void main(String[] args) {
        ModifierDefault m=new ModifierDefault();
        m.display();
        System.out.println(m.name);//we can use it since the accessibility of defult modifier is within the same package
    }

}
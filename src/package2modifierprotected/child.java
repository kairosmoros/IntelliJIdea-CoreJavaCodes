package package2modifierprotected;
import package1modifierprotected.parent;
public class child extends parent//subclass inheriting from parent
{
    void accessInSubclass()
    {
            show();//accessing protected method
            number = 10;//accessing protected number
            System.out.println("From Child: " + number);

    }
    public static void main(String[] args)
    {
        child c= new child();
        c.accessInSubclass();
        Outsider O= new Outsider();
        O.tryAccess();

    }

}
 class Outsider//not a subclass, just another class
{
    void tryAccess()
    {
        parent p= new parent();
        //p.number=50;//error: number has protected access in package1modifierprotected
        //p.show();//error: show() has protected access in package1modifierprotected
        System.out.println("Outsider can't access protected members directly. ");
    }
}


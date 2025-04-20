package Interface;

public class interfacedemo1
{
    public static void main(String[] args)
    {
        Flyable f1 = new Duck();
        f1.fly();
        swimmable s1= new Duck();
        s1.swim();
    }

}
interface Flyable
{
    void fly();
}
interface swimmable
{
    void swim();
}
class Duck implements Flyable , swimmable
{
    public void fly()
    {
        System.out.println("the Duck is flying ");
    }
    public void swim()
    {
        System.out.println("the Duck is swimming");
    }
}
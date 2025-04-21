package Typecasting;
class Parent
{
    void show()
    {
        System.out.println("This is Parent class method ");
    }
}
class Child extends Parent
{
    void show()
    {
        System.out.println("This is Child class Method ");
    }
}
public class ReferenceTypecasting
{
    public static void main(String[] args) {
        Parent p= new Parent();
        p.show();
        p= (Parent) new Child();//upcasting the reference variable p (type casting is not mandatoru in downcastin)
        p.show();
        Child c= (Child ) p; //type casting is mandatory (In downcasting)
        c.show();
    }
}

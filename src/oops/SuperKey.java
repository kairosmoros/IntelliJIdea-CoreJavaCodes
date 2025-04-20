package oops;
class Parent
{
    String name;
    void details()
    {
        System.out.println(name.toUpperCase());
    }
}
class Child extends Parent
{
    String name;
    public void details()
    {
        super.name="Parent";//refers to parent class member
        name="Child ";
        System.out.println(super.name + " and " +name);
        super.details();//refers to parent class method
    }
}
public class SuperKey {
    public static void main(String[] args) {
        Child c= new Child();
        c.details();
    }
}

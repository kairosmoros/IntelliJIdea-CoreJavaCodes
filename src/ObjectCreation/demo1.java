package ObjectCreation;
class Person
{
    String name;
}
public class demo1
{
    public static void main(String[] args) {
        //First object with name 'obj'
        {
            Person obj= new Person();
            obj.name="Alice";
            System.out.println("Inside Block 1: " +obj.name);
        }
        //Second object with same name 'obj' but in  different scope
        {
            Person obj = new Person();
            obj.name="Bob";
            System.out.println("Inside Block 2: " +obj.name);
        }
    }
}
/* Both obj variables exist in different blocks (scopes).

Each block has its own separate Person object.

Even though the variable name is the same (obj), they are completely different instances.*/
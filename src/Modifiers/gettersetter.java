package Modifiers;
class privateModifier2
{
    private String name="Prashant";//private
    private void display()
    {
        System.out.println("Hello "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//if this setter i remove then outside people can't modify it rather they can only see and read it
    }
}

public class gettersetter {
    public static void main(String[] args) {
        privateModifier2 m= new privateModifier2();
        /*m.display();*/ // you can't access it since the private modifier accessebility is within that particular class in which it is declared
      System.out.println(m.getName());
      m.setName("Ratan");
      System.out.println(m.getName());

    }
}
/*
getter and setter some points to note:
getX and setX
✅ If you're writing pure Java code, yes, the name of X doesn't matter — only the logic in the method matters.

❌ If you're using frameworks/tools, then you should follow the getX() and setX() convention exactly, where X matches the field name with the first letter capitalized.


 */

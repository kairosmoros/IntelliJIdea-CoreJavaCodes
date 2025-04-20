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

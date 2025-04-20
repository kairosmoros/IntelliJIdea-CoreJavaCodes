package Modifiers;
class privateModifier
{
    private String name="Prashant";//private
    private void display()
    {
        System.out.println("Hello "+name);
    }
}

public class privatemodifier {
    public static void main(String[] args) {
        privateModifier m= new privateModifier();
        /*m.display();*/ // you can't access it since the private modifier accessebility is within that particular class in which it is declared
        //YOU CAN ACCESS IT WITH GETTER AND SETTER
    }
}

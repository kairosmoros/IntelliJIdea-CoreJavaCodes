package Modifiers;

public class DefaultTest {
    public static void main(String[] args)
    {
        ModifierDefault m= new ModifierDefault();
        System.out.println(m.name);//here we are accessing the default modifier since the accessibility of it is within the same package
    }
}

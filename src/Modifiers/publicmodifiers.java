package Modifiers;

public class publicmodifiers
{

        public String name="Prashant Yadav";
        public void display()
        {
            System.out.println("My name is " +name);
        }
}
class testpublic
    {
        public static void main(String[] args)
        {
           publicmodifiers t1= new publicmodifiers();
           t1.display();
         System.out.println(t1.name);
    }

}

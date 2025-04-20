package package1modifierprotected;

import Modifiers.publicmodifiers;

public class parent
{
    protected int number=42;//protected variable
    protected void show()//protected method
    {
        System.out.println("parent's Number: "+number);
    }

    public static void main(String[] args)
    {
        parent p=new parent();
        p.show();
        packagebuddy p1=new packagebuddy();
        p1.accessInSamePackage();

    }

}

class packagebuddy //same package as Parent, but not a subclass
{
    void accessInSamePackage() {
        parent p = new parent();
        p.number = 99;// works : same package access
        p.show(); // works : same package access
        System.out.println("From SamePackageBuddy: " + p.number);
        //here I am going to access the public package modifier by writing it in protected modifier or you can write it anywhere and access that public modifier
        //because it is public
         publicmodifiers t3= new publicmodifiers();
         t3.display();
        System.out.println(t3.name);
    }
}




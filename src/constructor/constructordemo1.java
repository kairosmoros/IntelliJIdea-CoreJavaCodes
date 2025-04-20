package constructor;
class city1
{
    public void m1()
    {
        System.out.println("Saharanpur");
    }
    city1()
    {
        System.out.println("constructor city 1 ka chal rha hai");
    }
}
class city
{
    public void m1()
    {
        System.out.println("Agra");
    }
    city()
    {
        System.out.println("constructor chal rha hai");
    }
}

public class constructordemo1
{
    public static void main(String[] args) {
       city c=new city();
       city1 c1= new city1();
        c1.m1();
        c.m1();
    }
}

package oops;
class Rambarai
{
    public void m1()
    {
        System.out.println("200 square feet shop ");
    }

}
class Ramadhar extends Rambarai
{   int a=34;
    public void m2()
    {
        System.out.println("2000 Square feet shop");

    }
}
class Prashant extends Ramadhar
{
    public void m3()
    {
        System.out.println("Prashant");
    }
}

public class multilevelInheritance
{
    public static void main(String[] args)
    {
        Prashant prashant=new Prashant();
        prashant.m1();
        prashant.m2();
        prashant.m3();
    }
}

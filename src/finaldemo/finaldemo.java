package finaldemo;
class finaltest
{
    final void m1()
    {
        System.out.println("ab iska value koi bhi change nhi krr sakta although inheritance hoga child class me but ye content nhi change ho payega ");
    }
}
class testfinal extends finaltest
{
    //void m1()//here you can't override it final  m1() that is final method
    {
        System.out.println("abhi yaha parent class ka content change nhi krr paunga although mai uski saari methods aur content le lunga prr change nhi krr paunga");
    }
}
public class finaldemo
{
    public static void main(String[] args)
    {
        finaltest f= new finaltest();
        testfinal f1= new testfinal();
        f.m1();
        f1.m1();

    }

}

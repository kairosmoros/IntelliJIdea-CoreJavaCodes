package Staticdemo;
class Test
{
    //static variable is also instance variable or say static instance variable
    static int a=10;//class loading ke time hi value assign hoga aur isse jagah mil jayega due to static
    int b=40;
    public void display()
    {
        System.out.println(a);
    }
    public void print()
    {
        System.out.println(b);
    }
   /* public static void print()
    {
        System.out.println(b);//error because we can access from non-static to static but not from static to non-static
    }

    */
}
public class Staticdemo {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.a=100;
        Test t2=new Test();
        t2.a=200;
        Test t3 = new Test();
        t3.a=500;
        t1.b=20;
        t2.b=30;
        t3.b=50;
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t3.a);
        System.out.println(Test.a);//static variable can also be accessed like this
        System.out.println(t1.b);
        System.out.println(t2.b);
        System.out.println(t3.b);
        t1.print();
        t2.print();
        t3.display();
    }


}

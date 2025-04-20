package finaldemo;
/*final*/ class finaltest1//final dene se class ko hi inherit nhi kar paunga
{
    final void m1()
    {
        System.out.println("ab iska value koi bhi change nhi krr sakta although inheritance hoga child class me but ye content nhi change ho payega ");
    }
}
class testfinal1 extends finaltest1// here you can't even inherit the parent value since you want no change in the parent class also no inheritance from the parent class
{

}
public class finaldemo1
{
    public static void main(String[] args)
    {
        finaltest1 f= new finaltest1();
        testfinal1 f1= new testfinal1();
        f.m1();
        f1.m1();

    }

}

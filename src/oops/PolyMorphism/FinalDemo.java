package oops.PolyMorphism;
final class FinalDemo1
{
    final int a=10;
    //a=20;//Invalid (since you can't modify the final variable
    //final int c;//Invalid since final variables must be initialized first
    final void m1()
    {
        System.out.println("Hello ");

    }
}
public class FinalDemo
{
    public static void main(String[] args) {
        FinalDemo1 d= new FinalDemo1();
        d.m1();
    }
}

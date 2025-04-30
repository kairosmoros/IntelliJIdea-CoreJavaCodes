package oops.PolyMorphism;

public class methodoverridingtest
{
    public static void main(String[] args)
    {
            TestParent t5= new TestParent();
            t5.m1();

    }
}
class TestParent
{
    void m1()
    {
        System.out.println("parent");
    }
    protected void m2()
    {
        System.out.println("hello parent");
    }
}

class testChild extends TestParent
{
     void m1()
    {
        System.out.println("parent");
    }

    @Override
   public void m2() //here we have increased the accessibility of the parent method by changing it from protected to public
    {
        super.m2();
    }
}
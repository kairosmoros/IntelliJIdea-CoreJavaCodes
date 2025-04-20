package oops.PolyMorphism;

class overloading
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public int add(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }
}
public class methodoverlaodingdemo
{
    public static void main(String[] args) {
       overloading a= new overloading();
       int a1=a.add(2,3);
       System.out.println(a1);
        System.out.println(a.add(2,4,5));
    }
}

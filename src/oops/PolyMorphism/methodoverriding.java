package oops.PolyMorphism;
class shape
{
    void draw()
    {
        System.out.println("Drawing shape...");
    }
}
class circle extends shape
{
    @Override
    void draw() {
        System.out.println("mai shape nhi circle draw karunga");
    }
}
class rectangle extends shape
{
    @Override
    void draw() {
        System.out.println("I will draw rectanngle not shape");
    }
}
public class methodoverriding
{
    public static void main(String[] args)
    {
        shape s1= new shape();
        circle c1= new circle();
        rectangle r1= new rectangle();
        //shape s2= new rectangle();
        s1.draw();
        c1.draw();
        s1=r1;
        s1.draw();

    }
}


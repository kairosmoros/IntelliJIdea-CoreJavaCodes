package FunctionalInterfaceinJava;
/*
1. Interface that accepts only one abstract method.
2. We must define with annotation @FunctionalInterface
3. Functional Interface allow static and default methods.
 */
@java.lang.FunctionalInterface
interface Test
{
    void m1();
    //void m2();//Error since only one abstract method is accepted in FunctionalInterface
}
class Testy implements Test
{
    public void m1()
    {
        System.out.println("The implementation of iterface Test is  in Testy class: ");
    }
}
public class FunctionalInterface
{
    public static void main(String[] args) {
       Test t=new Testy();
       t.m1();


    }
}


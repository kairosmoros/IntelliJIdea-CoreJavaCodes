package oops;

public class inheritancedemo
{
    public static void main(String[] args)
    {
        creta creta=new creta();//creates a creta's object
        //Yaha be default pahle baap ka constructor chalega then beta ka , beta wala implicitly chalega
        creta.horn();//calls creta's horn()
        System.out.println(creta.a);//Access inherited field a
        car car=new car();//creates a car's object
        car.horn();//calls a car's horn()
        car car1=new creta();//creates a creta's object , assigned to car reference
        /*
       1. In car car1 = new creta();, car1 is a reference of type car (superclass), but the object created is of type
        creta (subclass).
       2. The reference type (car) determines which members (fields{VARIABLES} and methods) are visible at compile time. You can
       only call methods or access fields that are declared in the car class (or its superclasses/interfaces) through
       car1.
       3. However, due to runtime polymorphism, if a method is overridden in the subclass (creta), the subclass’s
       implementation is called at runtime. Fields, on the other hand, are not polymorphic—they are resolved based on
        the reference type, not the object type.
        */
        car1.horn();//calls creta's horn() due to runtime polymorphism
        //car1.engine();//THIS YOU CAN'T CALL BECAUSE IN CAR CLASS(SUPER CLASS) ENGINE METHOD IS NOT DECLARED
    }

}
class car
{
    int a=10;
    public void horn()
    {
        System.out.println("pepe pepe");
    }
    car()
    {
        System.out.println("car's constructor");
    }
}
class creta extends car
{

    public void horn()
    {
        System.out.println("poo poo");
    }
    public void engine()
    {
        System.out.println("1450");
    }
    creta()
    {
        System.out.println("creta's constructor");
    }

}




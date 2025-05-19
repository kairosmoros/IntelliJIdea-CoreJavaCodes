package StaticAndDefaultMethodInterfaceJDK7;
/* Interface (till JDK7)
1. Interface is a collection of abstract methods.
2. Interface methods are by default public and abstract.
3. Any class can implement interface
4. Implemented class override abstract methods.
NOTE: The object address of implemented class assigns to Interface type reference variable(code is down )

1. Interface variables are by default public static final.
2. We must initialize variables defined in interface.
3. We can't modify variables as they are final.

 */
interface Test
{
    void m1();//public abstract
}
class Demo implements Test{
    public void m1()
    {
        System.out.println("m1....");
    }
}
public class Demo1
{
    public static void main(String[] args)
   {
       Test obj=new Demo();//up-casting obj.m1();
       obj.m1();
   }
}

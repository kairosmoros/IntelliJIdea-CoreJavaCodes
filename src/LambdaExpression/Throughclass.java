package LambdaExpression;
/* Lambda Expression is a simplest form of Functional interface implementation
  We can implement Functional Interface in three ways.
  1. Through class
  2. Through anonymous inner class
  3. Through lambda expression
 */
// Implementing Functional Interface Through class
@FunctionalInterface
interface First
{
    void fun();
}
class Second implements First {
    public void fun()
    {
        System.out.println("fun....");
    }
}
public class Throughclass
{
    public static void main(String[] args) {
        First obj=new Second();
        obj.fun();
    }

}

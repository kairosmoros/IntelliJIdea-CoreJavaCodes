package oops;
class Dad
{
   public void m1()
   {
       System.out.println("200 squere feet shop");
   }
}
class Son extends Dad
{

}
public class SingleLevelInheritance
{
    public static void main(String[] args)
    {
        Son Son = new Son();
        Son.m1();
    }

}

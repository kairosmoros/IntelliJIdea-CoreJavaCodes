package constructor;
class city2
{  // String cityname;
    //String cityname="Prashant Yadav";
    String cityname;
    city2(String cityname)
    {
        System.out.println(cityname);
    }
  public void m1()
  {
      System.out.println(cityname);
  }
}
public class constructordemo2
{
    public static void main(String[] args)
    {
        city2 c=new city2("Baliya");
        c.m1();
    }
}

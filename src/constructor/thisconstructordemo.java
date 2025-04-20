package constructor;
class city3
{
    String cityname;//instance variable
    // instance variabel : it is a variable which is an object or declared of or inside the class
    //local variables are declared inside the method, constructor or block
    city3(String cityname)
    {
        System.out.println("the city name is "+(cityname));
    }
    public void m1()
    {
        String cityname="Bhopal";
        this.cityname="delhi";//always remember that 'this' variable is mainly used for the instance variable and not for
        // local varible also if local variable is not present then without 'this' also it will go to instance variable
        System.out.println("the city name now is  " +(this.cityname));
        System.out.println("the cityname for local variable is "+(cityname));
        this.cityname="Haryana";
        System.out.println("now the city name is "+(cityname));
    }
}
public class thisconstructordemo
{
    public static void main(String[] args)
    {
        city3 c=new city3("Saharanpur");
        c.m1();
        c.m1();

    }

}

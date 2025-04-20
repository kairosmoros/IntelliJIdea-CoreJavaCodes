package constructor;
class city5
{
    public void m1()
    {
        System.out.println("Hakimpet");
    }
    city5()
    {
        System.out.println("Constructor chal rha hai ");
    }
}
class city4
{
    city5 city5;//this means city4 has an instance variable (city5 city5) that can store the address of a city5 object
    public void m1()
    {
        city5.m1();
    }
   city4(city5 city5)//this city 4 constructor takes a city5 object as a parameter
    {
        this.city5=city5;//assigns the received object to the instance variable
    }
}

public class constructordemo4
{
    public static void main(String[] args)
    {
        city5 c5= new city5();//c5 is storing the reference(memory address) of this city5  object
        city4 c= new city4(c5);
        c.m1();
    }
}

package oops;
abstract class vehicle
{
    public abstract void engine();
    public void horn()
    {
        System.out.println("beep beep");
    }
}
class BMW extends vehicle
{
    @Override
    public void engine()
    {
        System.out.println("3000 cc engine");
    }
}
class Mahindra extends vehicle
{
    @Override
    public void engine() {
        System.out.println("4000cc engine");
    }
}
public class abstractiondemo {
    public static void main(String[] args) {
        BMW b1= new BMW();
        b1.engine();
        Mahindra m=new Mahindra();
        m.engine();
    }
}

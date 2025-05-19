package StaticAndDefaultMethodInterfaceJDK8;
/* Default key is necessary(absolutely) , Because default tells the compiler: "This method is allowed to have a
 body/Implementation inside the interface". Without the default keyword, Java expects it to be an abstract method (with
 no body) . [SO you must write default before every default method in interface].

 NOTE: all the rules of JDK7 is still applicable in java8 and onwards and some more other flexibility it provides us to
 write the code smoothly.
 */
interface Vehicle
{
    static String parachute()
    {
        return "Two Parachutes";
    }
    default String airBags()
    {
        return "Two airBags";
    }
    default String alarmOn()
    {
        return "Alarm at speed of 100";
    }
    int maxSpeed();//abstract method
}
class Alto implements Vehicle
{
    public int maxSpeed()
    {
        return 160;
    }
}
class RollsRoyace implements Vehicle
{
    public int maxSpeed()
    {
        return 530;
    }
}
public class DefaultMethod
{
    public static void main(String[] args) {
        Vehicle alto=new Alto();
        System.out.println("Alto maximum speed: " +alto.maxSpeed());
        System.out.println("Alto Air Bags: " +alto.airBags());
        System.out.println("Alto alarm: " +alto.alarmOn());
        System.out.println("Alto Parachute: " +Vehicle.parachute() );
        Vehicle RR=new RollsRoyace();
        System.out.println("RR maximum speed: " +RR.maxSpeed());
        System.out.println("RR Air Bags: " +RR.airBags());
        System.out.println("RR alarm: " +RR.alarmOn());
        System.out.println("RR Parachute: " + Vehicle.parachute() );

    }
}

package DIdependencyinjection;
/* Field Injection Demo using core java


💡 What is Field Injection?
Field injection means injecting a dependency directly into a class’s field without using a constructor or setter.
 */


//Step 1: Interface and Implementation
interface Engine1
{
    void start();
}
class DieselEngine implements Engine1
{
    public void start()
    {
        System.out.println("Diesel Engine started.");
    }
}
// Step 2: The Dependent Class( Field Injection Simulation)
class Car2
{
    //This is the field to inject
    Engine1 engine;
    public void drive()
    {
        if(engine !=null)
        {
            engine.start();
            System.out.println("Car is moving...");
        }
        else System.out.println("no engine found! Car can't move...");
    }

}
//Step 3: Manual Injector( like what Spring does internally)
class Injector
{
    public static void injectEngine1(Car2 car, Engine1 engine)
    {
        car.engine=engine; // Field injection
    }
}
//Main Program
public class FieldInjectionDemo1 {
    public static void main(String[] args) {
        Car2 car=new Car2();
        Engine1 engine= new DieselEngine();
        //Simulate field injection.
        Injector.injectEngine1(car,engine);
        car.drive();
    }
}
/* 🔍 What You Just Did
Car didn’t know how to create an Engine.

Injector class set the engine field directly — simulating Spring’s field injection.

It’s flexible: tomorrow you can inject PetrolEngine, ElectricEngine, etc.

⚠️ Drawbacks of Field Injection (in real-world use)
Harder to unit test (no constructor argument to mock).

Violates immutability (you can’t make the field final).

Hidden dependencies — less obvious from class signature.

 */
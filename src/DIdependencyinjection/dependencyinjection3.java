package DIdependencyinjection;
/*
    Setter Injection
*/
class Car1
{
    private Engine engine;
    // Setter method to inject dependency
    public void setEngine(Engine engine)
    {
        this.engine=engine;
    }
    public void drive()
    {
        engine.start();
        System.out.println("Car1 is moving.");
    }
}
public class dependencyinjection3 {
    public static void main(String[] args) {
        Engine engine=new PetrolEngine();
        Car1 car=new Car1();
        car.setEngine(engine);//Inject using setter
        car.drive();
    }
}
/* When to use:
    When the dependency is optional
    When you need reusability or configuration
 */

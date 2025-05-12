package LooseAndTightCouplingDemo;
/* In loose coupling, classes depend on abstractions(interfaces) rather than concrete classes.
This increases flexibility and maintainability.
 */
//Abstraction
interface Engine1//due to name conflict I am naming Engine to Engine1
{
    void start();
}
//Implementation 1
class PetrolEngine implements Engine1
{
    public void start()
    {
        System.out.println("Petrol engine started");
    }
}
//Implementation 2
class ElectricEngine implements Engine1
{
    public void start()
    {
        System.out.println("Electric engine started");
    }

}
//Car1 depends on Engine1 interface, not a specific engine1
class Car1//Car class is named as Car1 due to naming conflict
{
    private Engine1 engine;
    // Constructor Injection and this is a part of DI I mean dependency injection ie; Dependency Injection means supplying an object’s dependencies from outside, instead of the object creating them itself.
    // so instead of writing like this
    // class Car {
    //    Engine engine = new Engine(); // Car creates its own Engine
    //}
    //we write the below code

    public Car1( Engine1 engine)
    {
        this.engine= engine;
    }
    public void startCar()
    {
        engine.start();
    }
}
public class loosecouplingsimpledemo
{
    public static void main(String[] args) {
        Engine1 petrol=new PetrolEngine();
        Car1 car2= new Car1(petrol);
        car2.startCar();
        Engine1 electric =new ElectricEngine();
        Car1 car3=new Car1(electric);
        car3.startCar();

    }
}
/* Car is loosely coupled with engine
You can switch engines without changing the car class
 */
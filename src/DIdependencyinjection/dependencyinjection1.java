package DIdependencyinjection;
/*
    1. Constructor Injection
 */
interface Engine
{
    void start();//Engine is abstract and we know abstract classes can't be instantiated.
}
class PetrolEngine implements Engine
{
    public void start()
    {
        System.out.println("Petrol Engine Started.");
    }
}
class Car
{
    private Engine engine;
    //Constructor Injection
    public Car(Engine engine)
    {
        this.engine=engine;
    }
    public void drive()
    {
        engine.start();
        System.out.println("Car is moving.");
    }
}
public class dependencyinjection1
{
    public static void main(String[] args) {
        Engine engine=new PetrolEngine();//Dependency Created ( Engine Implementation since Car depends on Engine)
        Car car=new Car(engine);// Injection Dependency ( Dependency is injected via constructor ie; so here we are solving that dependency via injecting it in the constructor  of the class Car)
        car.drive();

    }
}
/*
🔧 In Code: Where is the Dependency?
Take this constructor injection example again:

java
Copy
Edit
Engine engine = new PetrolEngine(); // STEP 1: Create the dependency
Car car = new Car(engine);          // STEP 2: Inject it into the Car class
Here’s what’s really happening:

🔹 Step 1: Creating the Dependency
java
Copy
Edit
Engine engine = new PetrolEngine();
PetrolEngine is a concrete implementation.

You're saying: “I need something that can act like an Engine, and I choose PetrolEngine.”

🔁 This line creates the actual object that the Car will depend on.

→ So the dependency is created here, but not inside the Car class. That’s important.

🔹 Step 2: Injecting the Dependency
java
Copy
Edit
Car car = new Car(engine);
Here, the dependency (PetrolEngine object) is passed into the Car.

The Car class doesn’t care what kind of engine it is — as long as it follows the Engine interface.

→ So this line is where dependency injection happens — you’re injecting what Car needs from the outside, rather than letting Car create it on its own.

🚗 Real-World Analogy: Car and Engine
Roles:
Engine → abstract idea (interface): "I need something that can start."

PetrolEngine → actual object (implementation): "I am a thing that can start using petrol."

Car → depends on some Engine, but doesn't care which one.

🎯 Real-World Example:
You're a car manufacturer building cars.
You design the Car so that an engine is provided to it — maybe from Honda, Suzuki, or Tesla.

java
Copy
Edit
Engine engine = new PetrolEngine(); // You choose Honda engine
Car car = new Car(engine);          // You install the Honda engine into your car
The Car doesn't build its own engine.

It just accepts any engine that fits the required contract (Engine interface).

If tomorrow you want to switch to ElectricEngine, you don't have to redesign the car — just change the engine before injecting it.

💡 Summary
Concept	In Code	In Real Life
Dependency Created	new PetrolEngine()	Buying/choosing an engine
Dependency Injected	new Car(engine)	Installing engine into car chassis
Dependency Consumed	engine.start() inside Car	Car uses engine to move
Loose Coupling Achieved	Car depends on Engine only	Car doesn’t care who made the engine

🔄 Conclusion
The dependency is the Engine object (actually PetrolEngine) that the Car needs in order to function.
The injection is you providing that engine to the Car — from the outside.

This way:

Car doesn’t create the dependency.

Car doesn’t care about which engine.

You control what the Car uses — which makes your design flexible.
 */
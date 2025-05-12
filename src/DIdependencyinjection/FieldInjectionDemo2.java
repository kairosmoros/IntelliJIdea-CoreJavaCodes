package DIdependencyinjection;

import java.lang.reflect.Field;

/* FIELD INJECTION (using Reflection)

 ✅ What is Reflection?
Reflection is a feature in Java that allows code to:
Inspect classes, fields, methods at runtime.
Access or modify fields (even private ones!).
Instantiate objects dynamically.
Spring uses this power to inject dependencies directly into fields (even private ones), which is what @Autowired does under the hood
*/
//Step 1: Interface and Implementation
interface Engine3
{
    void start();
}
class PetrolEngine1 implements Engine3
{
    public void start()
    {
        System.out.println("Petrol Engine started.");
    }
}
//Step 2: Car class with private Field (No Constructor or setter)
class Car3
{
    private Engine3 engine;// No setter or constructor
    public void drive()
    {
        if(engine !=null)
        {
            engine.start();
            System.out.println("Car is moving...");
        }
        else System.out.println("Car can't move without engine.");
    }

}
//Step 3: Reflection-based injector
class ReflectionInjector
{
    public static void injectEngine(Car3 car,Engine3 engine)
{
    try
    {
        Field field =Car3.class.getDeclaredField("engine");//Get private field
        field.setAccessible(true);//Bypass private access
        field.set(car,engine);//Inject engine
        /*
        🧠 Think of it like this analogy:
     Let’s say:
    car = object of class Car3
    field = handle to the engine variable declared inside Car3
    engine = object of class PetrolEngine1
    So you're telling Java:
    “Hey, Java, for this object car, please go to its field named engine and assign it the value engine (an instance of PetrolEngine1).”

    import java.lang.reflect.Field;

class Car {
    private String name = "BMW";
     }
    public class Test {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Field field = Car.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(car, "Tesla"); // 🔥 This is the magic

        System.out.println("Updated car name: " + field.get(car)); // Output: Tesla
    }
}
     field.set(Car3.class, engine); // ❌ Wrong (unless the field is static)This would only work if the engine field were declared as:
    static Engine3 engine;

    ✅ Summary:
    You write	                          You mean                      	            Works?
    field.set(car, engine)	             Set engine in the car object	                ✅ Yes
    field.set(Car3.class, engine)	     Set engine in the Car3 class (static)	        ❌ No (unless field is static)

         */

    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}
}
// Step 4: Main Program

public class FieldInjectionDemo2 {
    public static void main(String[] args) {
        Car3 car= new Car3();
        Engine3 engine= new PetrolEngine1();
        ReflectionInjector.injectEngine(car,engine);//Simulate Spring injection
        car.drive();
    }
}

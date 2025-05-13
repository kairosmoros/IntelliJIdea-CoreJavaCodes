package DIdependencyinjection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    Field Injection (Using Reflection API)
 */
interface Engine4
{
   void start();

}
class ElectricEngine implements Engine4
{
    public void start()
    {
        System.out.println("Electric Engine Started.");
    }
}

class Car5
{
    private Engine4 engine;
    void drive()
    {

        if(engine!=null)
        {
            engine.start();
        }
        else System.out.println("engine unavailable");
    }
}
public class FieldInjectionDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        /* Reflection API

         */

        // Load the Car5 class dynamically
Class<?> aclass = Class.forName("DIdependencyinjection.Car5");
// Get the private 'engine' field
Field field= aclass.getDeclaredField("engine");
field.setAccessible(true);//Allow access to the private field

// Create a new instance of Car5
Object instance=aclass.getDeclaredConstructor().newInstance();                            //Object instance=aclass.newInstance(); [this is depricated in java]
Car5 car= (Car5) instance;
// Inject ElectricEngine  into the private 'engine' field
field.set(car,new ElectricEngine());
car.drive();

    }
}

package IsAhasArelationship;
/*
    Has-A relationship(Composition)
    1. Represents composition or aggregation.
    2. One class has a reference to another class.
    3. Achieved by creating an instance of one class inside another.
 */
class Engine
{
    void start()
    {
        System.out.println("Engine starts.");
    }
}
class Car
{
    Engine engine = new Engine();//Car has a relationship with Engine
    void start()
    {
        engine.start();
    }


}
public class HasArelationship {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
/*
    Meaning: 1. Car Has-A Engine
             2. So Car can use Engine's functionality
   Concept                  Keyword                 Example statement       Type
   HAS-A relationship ----> Instance in class ----> Car Has-A engine  ----> composition

 */
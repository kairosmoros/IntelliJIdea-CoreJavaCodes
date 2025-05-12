package IsAhasArelationship;
/*
    IS-A Relationship(Inheritance)
    1. Represents inheritance
    2. One class is a type of another class
    3. Achieve using extends(for class) or implements (for instance)

 */
class Animal
        {
            void eat()
            {
                System.out.println("This Animal eats food. ");
            }
        }
        class Dog extends Animal
        {
            void bark()
            {
                System.out.println("The dog barks.");
            }
        }
public class IsArelationshipdemo {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.bark();//Defined in Dog
        dog.eat();//Inherited from Animal
    }
}
/*
    Meaning: 1. Dog Is-A Animal
             2. So it inherits all behaviours of Animal
    Concept      Keyword                  Example statement        Type
    IS-A ---->   extends/implements ---->  Dog Is-A Animal   ----> Inheritance
     */
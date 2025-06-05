package ObjectCreation;
class Person
{
    String name;
}
public class demo1
{
    public static void main(String[] args) {
        //First object with name 'obj'
        {
            Person obj= new Person();
            obj.name="Alice";
            System.out.println("Inside Block 1: " +obj.name);
        }
        //Second object with same name 'obj' but in  different scope
        {
            Person obj = new Person();
            obj.name="Bob";
            System.out.println("Inside Block 2: " +obj.name);
        }
    }
}

/*

Let’s break it down with your example:

java
Copy
Edit
Car c = new Car();
🔍 What happens here?
Car c:
This declares a reference variable c of type Car. At this point, it doesn't point to anything.

new Car():
This creates a new object (or instance) of the Car class. The object is stored in heap memory.

Car c = new Car();:
The reference variable c is now pointing to the memory location of the newly created Car object.

🔧 What does the object actually "hold"?
Yes, the object holds the non-static variables (also called instance variables) and can execute methods defined in the class.

So:

Instance variables of the class are stored inside the object.

Constructors are not stored in the object. They are just used once to initialize the object during its creation.

Methods are not duplicated for every object—they exist in memory once (in method area), and objects can use them.

💡 So what is accessible via the object?
Assume:

java
Copy
Edit
class Car {
    int speed;
    String model;

    Car() {
        speed = 100;
        model = "Sedan";
    }

    void drive() {
        System.out.println("Driving at " + speed + " km/h");
    }
}
Now:

java
Copy
Edit
Car c = new Car();
c.speed and c.model: These are instance variables, stored inside the object c.

c.drive(): This method accesses the instance variables and performs an action. The method is called on the object and uses its data.

✅ Summary:
Concept	                              Is It Stored Inside the Object?	            Accessed via Object?
Instance variables	                  ✅ Yes	                                    ✅ Yes
Constructor	                          ❌ No (used once at creation)	                ❌ No
Instance methods	                  ❌ No (stored in method area)	                ✅ Yes
Static variables/methods	          ❌ No (belong to class)	                    ⚠️ Yes (not recommended via object)

🚨 Common Confusion

"Does the object hold these things?"

Instance variables? YES.

Constructor? NO (only used to create and initialize).

Methods? NO (but can be called on the object).

Static members? NO (belong to class, shared across all instances).

 */
/* Both obj variables exist in different blocks (scopes).

Each block has its own separate Person object.

Even though the variable name is the same (obj), they are completely different instances.

*/
package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

/*Approach -2 : (create employee objects by collecting form arrays)
 employee.java:
    create employee class with instance variables id,name,salary
    define parameterized constructor to intialize the object.
 */
class Employee3
{
    int id; String name; double salary;
    Employee3(int id, String name, double salary)
    {
        this.id=id; this.name=name; this.salary=salary;
    }
}
/* Main.java:
    collect values from arrays to create employee objects.
    display details using for-each loop.
 */
public class createemployeeobjectsbycollectindetialsfromarrays
{
    public static void main(String[] args) {
        int[] ids = {101, 102, 103, 104, 105};
        String[] names = {"Amar", "Akbar", "Ruby", "Mohan", "Ratan"};
        double[] salaries = {2013354, 2344622, 6564452, 3262, 26565952};
        List<Employee3> list = new ArrayList<>();
        for (int i = 0; i <= ids.length - 1; i++) {
            Employee3 e = new Employee3(ids[i], names[i], salaries[i]);
            list.add(e);
        }
        System.out.println("list is : " + list);
        System.out.println("details are: " );
        for(Employee3 empl:list)
        {
            System.out.println(empl.id+ "," +empl.name + ", " +empl.salary);
        }
        System.out.println("size of list is : " +list.size());
    }
}
/* Important note here:
Yes, you can reuse the same reference variable (e) in a loop or small block safely, as long as you're storing the objects somewhere else (like in a list).
But — if you want to access a specific object later, you must store and retrieve it using that collection (like list.get(index)), not the variable e — because e only remembers the last object it pointed to.

🧠 Detailed Explanation:
✔️ When Reusing a Reference is Fine:
This works well when:

You are creating objects inside a loop.

You don’t need to refer to them individually later by name.

You store them in a list, array, map, etc.

Example:


for (...) {
    Employee e = new Employee(...);
    list.add(e); // Good — now list stores the reference
}
You can still get any object back with:

list.get(0); // Get first employee
list.get(3); // Get fourth employee
So no confusion happens, because each object has its own memory space, and the list keeps track.

⚠️ When Reusing a Reference is NOT Good:
If you do this:

Employee e = new Employee(...);
// Now do something
e = new Employee(...);
// Now do something else
System.out.println(e.name); // ← You only get the last one!
Here, e was overwritten — the first object is now lost forever (unless it was stored somewhere).

So:

If you need to refer to each object individually by name, then create separate references:

java
Copy
Edit
Employee e1 = new Employee(...);
Employee e2 = new Employee(...);
✅ Rule of Thumb:
Situation	Reusing Reference (like e)	OK or Not?
Adding to a collection (e.g., List)	✅ OK
Needing to access each object by name	❌ Not OK
Reusing inside a loop	✅ OK
Storing only one object at a time	✅ OK
Multiple simultaneous access by name	❌ Not OK
 */


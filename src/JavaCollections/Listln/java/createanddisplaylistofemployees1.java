package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

/*
    Program to create and display List of Employees:
    1.Employee.java: contains Employee class
    2. Main.java: contains code of creating ArrayList with employess and display.
 */
/*
    Approach 1: ( create 3 employee objects directly and add to list )
    Employee.java:
     create employee class with instance variables id,name,salary
     define parameterized constructor to initialize the object
 */
class Employee1
{
    int id;
    String name;
    int salary;
    Employee1(int id, String name, int salary)
    {
        this.id= id;
        this.name= name;
        this.salary=salary;
    }
}
/* Main.java:
    create 3 employee objects and add to list
    display details uisng for-each loop
 */
public class createanddisplaylistofemployees1
{
    public static void main(String[] args)
    {
        List<Employee1> list= new ArrayList<>();
        Employee1 e1= new Employee1(101,"Harinder" , 4834989);
        Employee1 e2= new Employee1(102,"Kasturi" , 4834989);
        Employee1 e3= new Employee1(103,"Methi" , 4834989);
        list.add(e1);list.add(e2); list.add(e3);
        System.out.println("size of the list is : " +list.size());
        for( Employee1 e:list)
        {
            System.out.println(e.id+" , " +e.name + " , " +e.salary);

        }
    }
}

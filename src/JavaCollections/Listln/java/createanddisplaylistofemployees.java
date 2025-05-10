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
class Employee
{
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary)
    {
        this.id= id;
        this.name= name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/* Main.java:
    create 3 employee objects and add to list
    display details uisng for-each loop
 */
public class createanddisplaylistofemployees
{
    public static void main(String[] args)
    {
        List<Employee> e= new ArrayList<>();
        e.add(new Employee(101, "Harinder" , 389029 ));
        e.add(new Employee(102, "Kasturi" , 4899348));
        e.add(new Employee(103, "Methi" , 23892339));
        /*

        for( Employee e1:e)
        {
            System.out.println(e1.id+" , " +e1.name + " , " +e1.salary);

        }*/
        /* Display using for loop*/
        System.out.println("size of the list is: " +e.size());
      /*
        1. System.out.println("details of the employees are: ");
        for(int i=0; i<=e.size()-1; i++)
        {
            Employee e1= e.get(i);
            System.out.println(e1.id+ " , " + e1.name+ ", " +e1.salary);
        }


        2. System.out.println("details of the employees are: ");
        for(int i=0; i<=e.size()-1; i++)
        {
            Employee e1= e.get(i);
            System.out.println(e1);
        }
        */




    }
}

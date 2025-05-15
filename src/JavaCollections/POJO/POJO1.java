package JavaCollections.POJO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 POJO class: (Plain Old Java Object)
    POJO rules are:
        Class is public
        Variables are private
        Every variable has get() and set() methods
 */
// Approach 1: (Construct objects from Arrays)
// Employee.java: Create Employee POJO class
class Employee
{
    private int id;
    private String name;
    private double salary;
/*
    public Employee(int id, String name, double salary)
    {
    }
*/
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary( double salary)
    {
        this.salary=salary;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }
}
// Main.java: Construct objects by using Scanner
public class POJO1 {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Employee details: ");
            int id= sc.nextInt();
            /* Scanner sc = new Scanner(System.in);

            int id = sc.nextInt();  // Reads 101, leaves \n

            // Try sc.next():
            sc.next();  // Skips whitespace, but expects a real token next (not \n alone)
            // May block or behave unexpectedly

            // Try sc.nextLine():
            sc.nextLine();  // Reads and consumes the leftover \n properly ✅*/
            sc.nextLine();
            String name=sc.nextLine();
            double salary=sc.nextDouble();
            Employee e=new Employee();
            e.setId(id);
            e.setName(name);
            e.setSalary(salary);

            list.add(e);
            System.out.println("Want to add one more(Y/N):");
            if(sc.next().charAt(0)=='N')
            {
                break;
            }
        }
        System.out.println("Details are: ");
        for( Employee e:list)
        {
            System.out.println(e.getId()+ " , "+e.getName()+ " , " +e.getSalary());
        }

    }
}

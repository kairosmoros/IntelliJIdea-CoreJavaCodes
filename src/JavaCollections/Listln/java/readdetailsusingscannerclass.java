package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Employee4.java
class Employee4
{
    int id; String name; double salary;
    Employee4(int id, String name, double salary)
    {
        this.id=id; this.name=name; this.salary=salary;
    }
}
//Main.java

public class readdetailsusingscannerclass
{
    public static void main(String[] args) {
        List<Employee4> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of 5  Employee: ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Enter Emp-" + i + " details: ");
            System.out.println("Enter id : ");
            int id = sc.nextInt();
            sc.nextLine();//it consumes the /n which you have given while pressing enter while giving the id
           /*
           * Scanner sc = new Scanner(System.in);

int id = sc.nextInt();  // Reads 101, leaves \n

// Try sc.next():
sc.next();  // Skips whitespace, but expects a real token next (not \n alone)
            // May block or behave unexpectedly

// Try sc.nextLine():
sc.nextLine();  // Reads and consumes the leftover \n properly ✅*/
            System.out.println("Enter name :");
            String name = sc.nextLine();
 //No need to write it once you understand it         //  sc.nextLine();//again here after entering name you pressed enter and that /n part is being  consumed by it else it will reflect unwanted /n in the salary and it may give error
            System.out.println("Enter salary : ");
            double salary = sc.nextDouble();
            Employee4 e = new Employee4(id, name, salary);
            list.add(e);
            for(Employee4 e3:list) {
                System.out.println("List now at Employee-" + i + " is : " + e3.id + " , " + e3.name + " , " + e3.salary);
            }

        }
        for (Employee4 e2:list)
        {

            System.out.println(e2.id + " , " +e2.name + " , " + e2.salary);
        }

    }
}

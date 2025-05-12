package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee5
{
    int id; String name; double salary;
    Employee5(int id, String name ,double salary )
    {
        this.id=id; this.name=name; this.salary=salary;
    }
}
public class storeobjectstolistuntiluserquits
{
    public static void main(String[] args) {
        List<Employee5> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("Enter the employee details to add : ");
            System.out.println("Enter id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the salary: ");
            double salary = sc.nextDouble();
            Employee5 e5= new Employee5(id, name,salary);
            list.add(e5);
            for (Employee5 lis : list) {
                System.out.println("now list contains : " + lis.id + " , " + lis.name + " , " + lis.salary);
            }
            System.out.println("do you want to add more Employee/records to list : Yes/No " );
            String choice = sc.next();
            if (choice.equals("No"))
            {
                break;
            }
        }
        System.out.println("details of the list is : ");
        for (Employee5 l:list)
        {
            System.out.println("list contains : " + l.id + " , " + l.name + " , " + l.salary);
        }

    }
}

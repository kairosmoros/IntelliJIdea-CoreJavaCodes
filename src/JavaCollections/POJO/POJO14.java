package JavaCollections.POJO;
import java.util.*;
class Employee13
{
    private int id;
    private String name;
    private double salary;

    public Employee13(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
public void setName(String name)
{
    this.name=name;
}
    @Override
    public String toString() {
        return  "{"+
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class POJO14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee13> list = new ArrayList<Employee13>();
        while (true) {
            System.out.println("1. Add Record ");
            System.out.println("2. Display Record");
            System.out.println("3. Display All");
            System.out.println("4. Update Record");
            System.out.println("5. Delete Record");
            System.out.println("6. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.println("Enter details : ");
                System.out.println("id please ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name of the Employee : ");
                String name = sc.nextLine();
                System.out.println("Enter the salary of the Employee : ");
                double salary = sc.nextDouble();
                Employee13 e = new Employee13(id, name, salary);
                list.add(e);

            }
            if (choice == 2)
            {
                if (list.isEmpty())
                {
                    System.out.println("Empty List");
                }
                else
                {
                    System.out.println("Enter Id: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Employee13 e:list)
                    {
                       if(e.getId()==id)
                       {
                           System.out.println("Id is: "+ e.getId()+" Name is : " +e.getName() + " Salary: "+e.getSalary() );
                           found=true;
                           break;
                       }
                    }
                    if(!found)
                    {
                        System.out.println("Invalid Id / Id is Unavailable in the Record: ");
                    }
                }
            }
            if(choice==3)
            {
                if(list.isEmpty())
                {
                    System.out.println("list is empty: ");
                }
                else
                {
                    System.out.println("List is : " +list);
                 }
            }
            else if (choice==4)
            {
                if(list.isEmpty())
                {
                    System.out.println("Empty list ");
                }
                else {
                    System.out.println("Enter id : ");
                    int id=sc.nextInt();
                    boolean found=false;
                    for(Employee13 e:list)
                    {
                        if(e.getId()==id)
                        {
                            System.out.println("Press 1 to update the salary or Press 2 to update the Name : ");
                            int ch=sc.nextInt();
                            sc.nextLine();
                            switch(ch)
                            {
                                case 1:
                                System.out.println("Enter the new Salary :");
                                double salary=sc.nextDouble();
                                sc.nextLine();
                                e.setSalary(salary);
                                System.out.println("Your new salary is " +e.getSalary());
                                found=true;
                                break;
                                case 2:
                                    System.out.println("Enter the new Name : ");
                                    String name=sc.nextLine();
                                    e.setName(name);
                                    System.out.println("Your Updated name is : " + e.getName());
                                    found=true;
                                    break;
                                default:
                                    System.out.println("Enter the Correct options ie; either 1 or 2 ");
                            }


                        }
                    }
                    if(!found)
                    {
                        System.out.println("the Id you entered doesn't found in the database : ");
                    }
                }

            }
            else if(choice==5)
            {
                System.out.println("Enter the Id of the Employee You want to delete : ");
                int id=sc.nextInt();
                sc.nextLine();
                boolean found=false;
                for(Employee13 e:list)
                {
                    if(e.getId()==id)
                    {
                        int index=list.indexOf(e);
                        list.remove(index);
                        System.out.println("Removed");
                        found = true;
                        break;

                    }
                }
                if(!found)
                {
                    System.out.println("The entered Id doesn't exist in the database: ");
                }

            }
            else if(choice==6)
            {
                System.out.println("End ");
                System.exit(1);
            }
            else
                System.out.println("Invalid choice ");

        }
    }
}
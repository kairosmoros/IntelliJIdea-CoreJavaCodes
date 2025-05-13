package JavaCollections.POJO;
//ArrayList - Case Studies
//Display Details in Reverse Order - using for loop.
import java.util.ArrayList;
import java.util.List;

class Employee4
{
    private int id;
    private String name;
    private double salary;
    private int dept;
    private String location;
    int getId()
    {
        return this.id;
    }
    String getName()
    {
        return this.name;
    }
    double getSalary()
    {
        return this.salary;
    }
    int getDept()
    {
        return this.dept;
    }
    String getLocation()
    {
        return this.location;
    }
    void setId(int id)
    {
        this.id=id;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setSalary(double salary)
    {
        this.salary=salary;
    }
    void setDept(int dept)
    {
        this.dept=dept;
    }
    void setLocation(String location)
    {
        this.location=location;
    }
}
public class POJO4 {
    public static void main(String[] args) {
        List<Employee4> list = new ArrayList<>();
        int[] ids = {101, 102, 103, 104, 105, 106};
        String[] names = {"Amar", "Harish", "Satyam", "Annie Roi", "Ranie Desuza", "Harsha"};
        double[] salaries = {338848, 233435, 535353, 333335.35, 35334.3, 535353.3};
        int[] depts = {20, 10, 20, 20, 30, 10};
        String[] locations = {"Hyederabad", "Chennai", "Bangalore", "Hyderabad", "Pune", "Banglore"};
        for (int i = 0; i<ids.length; i++)
        {
            JavaCollections.POJO.Employee4 e = new JavaCollections.POJO.Employee4();
            e.setDept(depts[i]);
            e.setId(ids[i]);
            e.setName(names[i]);
            e.setLocation(locations[i]);
            e.setSalary(salaries[i]);
            list.add(e);

        }
        System.out.println("details of the employees are: ");
        for( int i=list.size()-1;i>=0; i--)
        {
            Employee4 e=list.get(i);
            /*
             List<Employee4> list:

            This means the list can only store objects of type Employee4.
            So, when you do list.get(i), it returns an object of type Employee4, and it’s safe to assign it to a variable of type Employee4.
            Employee4 e = list.get(i);:
            This works only because the list is typed to Employee4.
            If you had just written List list = new ArrayList(); without generics, the get(i) would return an Object, and you'd need to cast it:
            Employee4 e = (Employee4) list.get(i); // Unsafe and not recommended
            */
            System.out.println(e.getId() + ", "+e.getName() + " ,"+ e.getDept()+", "+e.getSalary()+ ", "+e.getLocation());
        }
    }
}
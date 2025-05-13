package JavaCollections.POJO;
//ArrayList - Case Studies
//Display Employee details belongs to Hyderabad
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee6
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
public class POJO6
{
    public static void main(String[] args)
    {
        List<Employee6> list = new ArrayList<>();
        int[] ids = {101, 102, 103, 104, 105, 106};
        String[] names = {"Amar", "Harish", "Satyam", "Annie Roi", "Ranie Desuza", "Harsha"};
        double[] salaries = {338848, 233435, 535353, 333335.35, 35334.3, 535353.3};
        int[] depts = {20, 10, 20, 20, 30, 10};
        String[] locations = {"Hyderabad", "Chennai", "Bangalore", "Hyderabad", "Pune", "Banglore"};
        for (int i = 0; i<ids.length; i++) {
            Employee6 e = new JavaCollections.POJO.Employee6();
            e.setDept(depts[i]);
            e.setId(ids[i]);
            e.setName(names[i]);
            e.setLocation(locations[i]);
            e.setSalary(salaries[i]);
            list.add(e);


        }
        System.out.println("details of the employees are: ");
        int count=0;
        for(Employee6 e1:list)
        {
            //if(e1.getLocation()=="Hyderabad");
            // String values are compared with 'equals()
            /*
            == compares object references, i.e., memory locations.
            It does not compare the actual text content inside the strings.
            So even if two strings look the same, == will return false unless they point to the exact same object in memory.
             */

            if(e1.getLocation().equals("Hyderabad"))
            /*
                Use .equals() for strict match
                🔹 Use .equalsIgnoreCase() if you want it a bit more forgiving
                🔹 Add .trim() if your string data may have extra spaces
 */
            {
                System.out.println(e1.getId() + ", " + e1.getName() + " ," + e1.getDept() + ", " + e1.getSalary() + ", " + e1.getLocation());
                count++;
            }
        }

        if (count==0)
        /*
        You're 100% correct that found is accessible inside the whole main() method and all loops within it.
        But when you comment out the condition if (!found), then you're no longer using the variable — you're only setting it — and that's why the IDE says: "found is never used".
         It’s just an optimization hint — not an error.
         */
        {
            System.out.println("Employee with location Hyderabad not found ");
        }

//Note: You can't have a method inside a method it is illegal in java

    }
}
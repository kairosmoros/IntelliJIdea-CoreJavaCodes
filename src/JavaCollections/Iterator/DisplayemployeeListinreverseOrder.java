package JavaCollections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//we must use for() loop to iterate in reverse order.
//For-each loop can move only in forward direction.
class Employee2
{
    int id; String name; int salary;
    Employee2(int id, String name, int salary)
    {
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
}
public class DisplayemployeeListinreverseOrder
{
    public static void main(String[] args) {
        List<Employee2> list= new ArrayList<>();
        list.add(new Employee2(101, "Prashant" , 348449));
        list.add(new Employee2(102, "Ratan " , 348393));
        System.out.println("size of the list is " +list.size());
      /*  System.out.println("details are ");
        for(int i=list.size()-1; i>=0;i--)
        {
            Employee2 e= list.get(i);
            System.out.println(e.id + "," +e.name+ "," + e.salary);
        } */
        /* Display using Iterator */
        System.out.println("size of the list is: " +list.size());
        System.out.println("Details are: ");
        Iterator<Employee2> itr= list.iterator();
        while(itr.hasNext())
        {
            Employee2 e= itr.next();
            System.out.println(e.id + " , "+e.name + " , " +e.salary);

        }
        /*
           Display reverse list using ListIterator
         */
        System.out.println("Details are :");
        ListIterator<Employee2> itr1 = list.listIterator(list.size());
        while(itr1.hasPrevious())
        {
            Employee2 e2= itr1.previous();
            System.out.println(e2.id+" , "+e2.name + ", "+ e2.salary);

        }

    }
}

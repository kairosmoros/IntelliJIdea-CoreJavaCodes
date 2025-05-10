package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
class object
{
    int id;
    String name;
    int salary;
    object(int id, String name, int salary)
    {
        this.id = id;
        this.name= name;
        this.salary=salary;
    }

 /*   @Override
    public String toString() {
        return "object{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }*/
}

public class foreachlooptoaccessdoubleobjectelement
{
    public static void main(String[] args) {
        List<object> list = new ArrayList<object>();
        list.add(new object(101, "Abhijeet" , 400000));
        list.add(new object(102, "Arrav" , 699599));
        list.add(new object(103, "Prashant Yadav" , 9383939));
      /*  for(object o : list)
        {
            System.out.println(o);
        }*/
        for(object o:list)
        {
            System.out.println(o.id + ", " +o.name + ", " +o.salary);
        }

    }
}

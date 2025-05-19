package JavaCollections.ComparatorJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    private int rollno;
    private String name;
    private int age;
    public int getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setRollno(int rollno)
    {
        this.rollno=rollno;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
public class Demo1
{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        int[] nums={101,102,103,104};
        String[] names={"Amar" , "Samar" , "Sravan Kumar"  , "Harish Mahto "};
        int[] ages={12,24,54,30};
        for(int i=0;i<nums.length; i++)
        {
            Student obj=new Student();
            obj.setRollno(nums[i]);
            obj.setAge(ages[i]);
            obj.setName(names[i]);
            list.add(obj);
        }
        Comparator<Student> s1=Comparator.comparing(Student::getName);
        Collections.sort(list,s1);
        System.out.println("Sorting by Name");
        for(Student st:list)
        {
            System.out.println(st.getName()+ " , " +st.getAge() + " , " + st.getRollno());
        }
        Comparator<Student> s2=Comparator.comparing(Student::getAge);
        Collections.sort(list,s2);
        System.out.println("Sorting by Age ");
        for(Student st:list)
        {
            System.out.println(st.getName() + " , " +st.getAge() + " , " +st.getRollno());
        }
        Comparator<Student> s3=Comparator.comparing(Student::getRollno);
        Collections.sort(list,s3);
        System.out.println("Sorting by rollno ");
        for(Student st:list)
        {
            System.out.println(st.getName()+" , " +st.getRollno()+ " , "+st.getAge());
        }
    }
}

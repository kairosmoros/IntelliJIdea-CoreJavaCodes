package JavaCollections.Comparator;
//Compare Student objects based on rollno
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    int age;
    int rollno;
    String name;
    Student1(int age, int rollno, String name)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
}
class ComparetoRollno implements Comparator<Student3>
{
 public int compare(Student3 s1, Student3 s2)
 {
     return Integer.compare(s1.rollno,s2.rollno);
     /*
       Integer.compare(int x, int y)
Returns:
0 → if x == y
Negative (e.g., -1) → if x < y
Positive (e.g., 1) → if x > y

      */
 }
}
public class ComparatorDemo2 {
    public static void main(String[] args) {
        List<Student3> list=new ArrayList<>();
        list.add(new Student3(21,105, "Anmol Mishra"));
        list.add(new Student3(13,102, "Alok kumar Mishra"));
        list.add(new Student3(22,103,"Rahul Kushwaha"));
        System.out.println("now we are sorting the list : ");
        Collections.sort(list,new ComparetoRollno());
        System.out.println("list after sort is : ");
        for(Student3 ls:list)
        {
            System.out.println(ls.name + " , " +ls.age +" , " + ls.rollno);
        }
    }
}

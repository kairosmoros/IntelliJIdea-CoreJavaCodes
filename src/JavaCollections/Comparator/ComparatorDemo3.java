package JavaCollections.Comparator;
// Compare Student object based on Name.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student3
{
    int age;
    int rollno;
    String name;
    Student3(int age, int rollno, String name)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
}
class ComparetoName implements Comparator<Student3>
{
    public int compare(Student3 s1,Student3 s2)
    {
        return s1.name.compareTo(s2.name);
        /*

        0 → if both strings are equal
< 0 → if string1 is less than string2
> 0 → if string1 is greater than string2
✅ The comparison is lexicographical (dictionary order), not by length.
Java compares character-by-character using Unicode values:

'A' < 'B'

'a' > 'A' (because lowercase letters have higher Unicode values)

✅ Example:

"Alok".compareTo("Anmol") ➝ negative (because 'l' < 'n')
"Anmol".compareTo("Rahul") ➝ negative (because 'A' < 'R')
         */
    }
}
public class ComparatorDemo3
{
        public static void main(String[] args) {
            List<Student3> list=new ArrayList<>();
            list.add(new Student3(21,105, "Anmol Mishra"));
            list.add(new Student3(13,102, "Alok kumar Mishra"));
            list.add(new Student3(22,103,"Rahul Kushwaha"));
            System.out.println("now we are sorting the list : ");
            Collections.sort(list,new ComparetoName());
            System.out.println("list after sort is : ");
            for(Student3 ls:list)
            {
                System.out.println(ls.name + " , " +ls.age +" , " + ls.rollno);
            }
        }
}

package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

class Mark
{
    String name;
    int rollNo;
    int mark;

    public Mark(String name, int rollNo, int mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }
    @Override
    public String toString()
    {
        return name+ " " +rollNo+ " " +mark;

    }
}
public class ListDemo5 {


    public static void main(String[] args) {
        Mark m1 = new Mark("Prashant", 12, 88);
        Mark m2 = new Mark("Kumar", 13, 92);
//here we are creating two object of class Mark which contains three things name,rollNo, mark
        List<Mark> studentList = new ArrayList<>();
        studentList.add(m1);//here when we add then all the three things of each object will be in the list
        studentList.add(m2);
        //Internally,int the list it's like [[Prashant, 12, 88], [kumar , 13, 92]]
      System.out.println(studentList);//It is not showing the result reason is it doesn't know how to print when you print integer type the java has inbuilt toString() for it but for others you have to override it
//to check it just comment toString() you will get your result
    }

}



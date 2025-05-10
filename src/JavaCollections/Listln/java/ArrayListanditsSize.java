package JavaCollections.Listln.java;
//add() method is used to append element to the list.
//size () method returns the length of list.
import java.util.*;
public class ArrayListanditsSize {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List is :" +list);
        System.out.println("Size is : " +list.size());



    }

}

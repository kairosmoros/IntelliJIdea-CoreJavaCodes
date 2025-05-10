package JavaCollections.Listln.java;
//add All(Collection c) method is used to merge 2 lists.
import java.util.*;
public class tomerger2arraylists
{
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        for(int i=1; i<=5; i++)
        {
            list1.add(i*5);
        }
        System.out.println(" list1 is : " +list1);
        List<Integer> list2= new ArrayList<>();
        for(int i=5; i>=1; i--)
        {
            list2.add(i*5);
        }
        System.out.println("list2 is : " +list2);
        list1.addAll(list2);
        System.out.println("list1 after list merge with list2 is : " +list1);
    }

}

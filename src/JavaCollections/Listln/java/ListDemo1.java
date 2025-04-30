package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        //add object in list
        if(list.isEmpty())
        {
            System.out.println("list is empty ");
        }
         else
        {
            System.out.println("list is not empty ");
        }
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
        System.out.println("list after adding elements in the list: " +list);
    }
}

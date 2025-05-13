package JavaCollections.Listln.java;

import java.util.ArrayList;//Hey, I want to use the ArrayList class from the java.util package
import java.util.List;

public class ListDemo
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       // List<Integer> list ;This means the list can only store objects of type Integer.
        //add object in list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);//duplicate
        System.out.println(list);

    }
}

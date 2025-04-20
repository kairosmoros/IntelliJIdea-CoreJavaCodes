package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(20);
        list.add(490);
        System.out.println(list);
        System.out.println(list.get(2));
        for(int data:list)//to traverse in the list
        {
            System.out.println(data);
        }

    }
}

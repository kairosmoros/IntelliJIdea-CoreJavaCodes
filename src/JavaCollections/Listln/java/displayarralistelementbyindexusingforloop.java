package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

//get(int index) method is used to retrieve each element using its index.
public class displayarralistelementbyindexusingforloop {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=5; i++)
        {
            list.add(i*5);
        }
        System.out.println("size of the list is : "+list.size());
        System.out.println("List is : ");
        for(int i=0; i<=list.size()-1; i++)
        {
            System.out.println(list.get(i));
        }
    }
}

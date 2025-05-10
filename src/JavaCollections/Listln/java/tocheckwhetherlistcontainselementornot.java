package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//contains() method returns true if the list has specified element
public class tocheckwhetherlistcontainselementornot {
    public static void main(String[] args)
    {
        List<Integer> list= new ArrayList<>();
        for(int  i=1; i<=5; i++)
        {
            list.add(i);
            System.out.println("list is : " +list);
        }
        System.out.println("Enter the element to remove from the list : ");
        Scanner sc= new Scanner(System.in);
        int element=sc.nextInt();
        if(list.contains(element))
        {
            list.remove(element);
            System.out.println("after removing the element value from the list now the list is : " +list);
        }
        else
        {
            System.out.println("no such element is present in the list ");
        }

    }
}

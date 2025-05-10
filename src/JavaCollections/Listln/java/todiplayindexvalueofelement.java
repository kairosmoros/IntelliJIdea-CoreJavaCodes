package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//indexOf() method returns index of specified element. It returns -1 if no such element in the list
public class todiplayindexvalueofelement
{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        for(int i=1; i<=5; i++)
        {
            list.add(i);
        }
        System.out.println("list is : " +list);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to find its index : ");
        int element=sc.nextInt();
        int index=list.indexOf(element);
        if(index!=-1)
            System.out.println("Index value is: "+index);
        else
            System.out.println("No such element in list ");
        System.out.println("list after removing the element is : " +list);
    }

}

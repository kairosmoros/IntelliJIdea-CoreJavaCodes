package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRemoveDemo
{
    public static void main(String[] args) {
        //remove(index)
        /*
        * create list with elements
        * read index
        * if index is valid - remove the element from the list
        * if the index is not valid - display error message
        * */
        List<Integer> l= new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            l.add(i);
        }
        System.out.println("list: " +l);
        System.out.println("Enter the index to remove: ");
        Scanner sc= new Scanner(System.in);
        int index=sc.nextInt();
        if(index < l.size())
        {
            l.remove(index);
            System.out.println("list is = " +l);
        }
        else
        {
            System.out.println("Error : No such index found...");
        }
        System.out.println("Enter the element to check: ");
        int element= sc.nextInt();
        if(l.contains(element))
        {
            System.out.println("Yes this element is there in the list and ");
            System.out.println("the index of the " +element+ " is: ");
            System.out.println(l.indexOf(element));
        }
        else {
            System.out.println("This element is not there in the list ");
        }


    }

}

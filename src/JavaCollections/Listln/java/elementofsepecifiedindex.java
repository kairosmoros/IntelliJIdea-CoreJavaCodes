package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//get(int index) returns the element of specified index.
public class elementofsepecifiedindex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=10; i<=50; i+=10)
        {
            list.add(i);
        }
        System.out.println("List is : " +list);
        System.out.println("Enter index to display value: ");
        int loc= sc.nextInt();
        System.out.println("Element at index-" +loc + " is: "+list.get(loc));
        //We specify the error message - if the index value is not present:
        /* if(loc>=0 && loc<=list.size()-1)
        {
            System.out.println(list.get(loc));
        }
        else
        {
            System.out.println("Invalid index");
        }*/
        /*  OR */
        try
        {
            System.out.println(list.get(loc));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Invalid index ");
        }
    }
}

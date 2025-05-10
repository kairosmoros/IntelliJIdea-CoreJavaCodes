package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//set(int index,E e) method replace the index element with specified element
/* Instructions to code
   create ArrayList with elements
   read the element to replace
   check the element is present or not in the list using contains() method
   if the element is present,
       Read the new element= to replace with.
   if the element is not present
       Display error message
 */
public class replaceexistingvalue {
    public static void main(String[] args)
    {
        List<Integer> list= new ArrayList<>();
        for(int i=10; i<=50; i+=10)
        {
            list.add(i);
        }
        System.out.println("list is : " +list);
        System.out.println("enter the element to remove : ");
        Scanner sc= new Scanner(System.in);
        int element1 = sc.nextInt();
        if(list.contains(element1))
        {
            System.out.println("Enter the element to replace with : ");
            int element2 = sc.nextInt();
            int  loc= list.indexOf(element1);
            if(loc!=-1)
            {
                list.set(loc, element2);
                System.out.println("updated list is : "+list);
            }

        }
        else
            System.out.println("No such element in the list ");

    }
}

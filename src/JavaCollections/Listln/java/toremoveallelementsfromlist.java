package JavaCollections.Listln.java;

import java.util.ArrayList;
import java.util.List;

//clear() method removes all elements from the list
/* Instructions to code:
   Create list with 5 elements
   Display -  List is not empty
   Remove all elements using clear() method
   Display - List is empty
 */
public class toremoveallelementsfromlist {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        for(int i=1; i<=5; i++)
        {
            list.add(i);
        }
        System.out.println("List is : "+list);
        if(list.isEmpty())
        {
            System.out.println("list is Empty ");
        }
        else
            System.out.println("list is not empty");
        list.clear();
        System.out.println("list is: "+list);
        if(list.isEmpty())
            System.out.println("list is Empty");
        else
            System.out.println("list is not empty");
    }
}

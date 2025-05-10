package JavaCollections.Listln.java;
//remove(int index) method removes element of specified index
/*
    Instructions to code:
    create list with elements
    read index value
    if the index is valid - remove the element and display list
    if the index is not valid - display error message
 */
import java.util.*;


public class toremoveindexelement {
    public static void main(String[] args) {
    List<Integer> list= new ArrayList<Integer>();
    for(int i=1; i<=5; i++)
    {
        list.add(i);
    }
        System.out.println("list is : "+list);
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the index to read that index's element ");
        int index=sc.nextInt();
        if(index>=0 && index <list.size())
        {
            list.remove(index);
            System.out.println("now after removing the value of index - "+index+ " is " +list);
        }
       else
            System.out.println("invalid Index : no such index is found");
    }
}

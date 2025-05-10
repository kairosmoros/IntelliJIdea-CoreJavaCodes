package JavaCollections.Listln.java;
// add(int index E e) method is used to insert element into specified index.
/* Instructons to code:
   Create ArrayList with 5 elements 10,20,30,40,50
   Read index to insert
   Check whether the index is present or not
   If the index is present, then read the value and insert.
   If the index is not present , display Error message

 */
import java.util.*;
public class insertelementatspecifiedindex {
    public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  List<Integer> list= new ArrayList<>();
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);
  list.add(50);
        System.out.println("List is :" +list);
        System.out.println("Enter index to insert: ");
        int loc=sc.nextInt();
        if(loc>=0 && loc<list.size())
        {
            System.out.println("Enter the element to insert : ");
            int element= sc.nextInt();
            list.add(loc,element);
            System.out.println("List is :" +list);
        }
        else
        {
            System.out.println("Invalid index");
        }
    }
}

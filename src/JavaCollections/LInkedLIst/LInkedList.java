package JavaCollections.LInkedLIst;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedList {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<>();
        LL.add("Apple");
        LL.add("Banana");
        LL.add("Orange");
        LL.add("Mango");
        LL.add("Grapes");
        System.out.println("LinkedList : " + LL);


        //Retrieving
        String first = LL.getFirst();//E getFirst() Returns the first element in this list
        String last = LL.getLast();//E getLast() Returns the last element in this list
        System.out.println("First : " + first);
        System.out.println("Last: " + last);
        String element = LL.get(2);// E get(int index) return  the element at the specified position in this list
        System.out.println("Element at position 2: " + element);

        //adding with different method
        System.out.println("Appending the specified element to the end of this LL");
        boolean ele = LL.add("Ratan");
        System.out.println(LL);
        System.out.println("Inserting the specified element at the specified position ");
        LL.add(2, "Sohini Das");
        System.out.println("Linked List now is : " + LL);
        System.out.println("Inserting the specified element at the begining of this list");
        LL.addFirst("Ravina Tondon");
        System.out.println(LL);
        System.out.println("Append the specified element to the end of this list");
        LL.addLast("Samira Raina");
        System.out.println(LL);
        System.out.println("Replacing index element with specified element");
        LL.set(2, "Sandeep Srivastava");
        System.out.println(LL);
        System.out.println("Returning the element's index or else if the element not found then will give -1 by default");
        System.out.println(LL.indexOf("Samira Raina"));
        System.out.println(LL);
        System.out.println(LL.indexOf("Banana"));


        //Searching
        boolean containsBanana = LL.contains("Banana");// boolean contains("Banana") returns true if this list contains the specified element
        System.out.println("Contains Banana: " + containsBanana);

        //Using listIterator(int index)
        System.out.println("Using listIterator from index 1:");
        ListIterator<String> li = LL.listIterator(1);
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        //Using descendingIterator()

        System.out.println("\n using descendingIterator: ");
        Iterator<String> di = LL.descendingIterator();
        while (di.hasNext())
        {
            System.out.println(di.next());
        }
        System.out.println("\n");
        
        //Removing
        System.out.println(LL.removeFirst());// E removeFirst() Removes and returns the first element from this list
        System.out.println( LL.removeLast());// E removeLast() Removes and returns the last element from this list
        System.out.println("After Removing first and last elements LL is : "+LL);
        LL.remove(1);// E remove(int index) Removes the element at the specified position in this list
        System.out.println("LinkedList after removing element at index 1 " +LL);
        boolean isEmpty=LL.isEmpty();// boolean isEmpty() returns true if the list is empty else false
        System.out.println("is linked list Empty ? \n " +isEmpty);
        int size=LL.size();//  int size() returns the number of elements in this list
        System.out.println("Size: " +size);
        LL.clear();//
        System.out.println("LinkedList after clearing all elements : " +LL);
    }
}

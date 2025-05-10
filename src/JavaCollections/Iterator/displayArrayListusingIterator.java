package JavaCollections.Iterator;
/*
    ITERATOR
    it is an interface
    iterator providing methods to iterate any collection
    iterator() method returns iterator object of any collection
    Methods
    boolean hasNext(): checks the next element is present or not to iterat
    Object next(): returns the next element of iterator objec.
 */
import java.util.*;
public class displayArrayListusingIterator {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        for(int i=1;i<=5;i++)
            list.add(i*5);
        System.out.println("Display using Iterator:");
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext())
        {
            Integer ele= itr.next();
            System.out.println(ele);
        }
    }
}

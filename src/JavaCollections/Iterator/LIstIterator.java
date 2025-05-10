package JavaCollections.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* It is an interface
    listIterator() method returns ListIterator object.
    Using ListIterator, we can iterate elements:
      1 in forward direction
      2 in backward direction
      3 from specified index value
 */
public class LIstIterator {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=5; i++)
        {
            list.add(i*5);
        }
        ListIterator<Integer> itr = list.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

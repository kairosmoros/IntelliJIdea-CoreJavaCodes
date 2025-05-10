package JavaCollections.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class displaylistfromspecifiedindexvalue
{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=10; i++)
        {
            list.add(i*5);
        }
        ListIterator<Integer> itr= list.listIterator(5);
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}

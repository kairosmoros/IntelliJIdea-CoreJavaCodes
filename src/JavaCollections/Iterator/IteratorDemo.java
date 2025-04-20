package JavaCollections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo
{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        list.add(60);
        System.out.println(list);
        Iterator<Integer> iterator= list.iterator();//iterator is a method in arralist class which Iterator type object so we are holding it in iterator
        while(iterator.hasNext())
        {
            Integer data = iterator.next();
            System.out.println(data);
            if(data==20)
            {
                iterator.remove();//here its removing from the list which means data variable has 20 in it but from the list it is removed
            }
            System.out.println(data);
        }
        System.out.println(list);
        int count=0;
        ListIterator<Integer> listiterator= list.listIterator();
        while(listiterator.hasNext())
        {
            Integer next= listiterator.next();
            System.out.println(next);
            count++;
            if(count==2)
            {
                while(listiterator.hasPrevious())
                {
                    Integer previous= listiterator.previous();
                    System.out.println(previous);
                }
            }

        }
        System.out.println(list);
        System.out.println(count);

    }
}

package JavaCollections.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class UserComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Integer data1= (Integer) o1;
        Integer data2= (Integer) o2;
        if(data1>data2) return +1;//you can write any positive value
        /* if >0 means a>b then go to right  in the bst tree
            if <0 means a<b then go to the left in the bst tree
            if 0 means a==b then don't insert - duplicates not allowed
            and you know after making tree the traversals like pre-order , post-order and In-order in here
            use In- order traversal to get the values of set in ascending or descending based
         */
         else if(data1<data2) return -2;//you can write any negative value
         else return 0;
    }
}
public class ComparatorDemo
{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet= new TreeSet<>(new UserComparator());//You're saying: “Hey TreeSet, don’t use the default way to compare elements. Use this custom way, defined in UserComparator.”
        /*So, now every time you do: treeSet.add(someNumber); the TreeSet needs to check where to place this number. It uses the compare() method in your UserComparator class to decide the order.*/
        treeSet.add(40);
        //When you do:treeSet.add(40);The TreeSet is empty, so it just adds 40.
        treeSet.add(10);//Then you do:treeSet.add(10);TreeSet now needs to compare 10 with existing elements (40) to decide where to put it.
        //So it calls:comparator.compare(10, 40);That means your compare() method is being called automatically by TreeSet behind the scenes:
       //So you're not calling it directly like UserComparator.compare(), but the TreeSet internally uses it to do comparisons.
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(20);
        System.out.println(treeSet);

    }
}

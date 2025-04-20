package JavaCollections.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;
class UserComparator1 implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Integer data1= (Integer) o1;
        Integer data2= (Integer) o2;
        if(data1>data2) return -1; //Means put the larger number in the left
        else if (data1<data2) return +1; //means put the smaller number to the right
        else return 0;
    }
}
public class ComparatprDemo1
{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet= new TreeSet<>(new UserComparator1());
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        System.out.println(treeSet);
    }
}

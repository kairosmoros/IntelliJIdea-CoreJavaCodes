package JavaCollections.Listln.java;
/* for each loop
    it is also called enhanced for loop
    it is since jdk5
    for-each loop provides easy syntax to process elements of Array or Collection
    Limitations:
    For each loop can process elements only in forward direction
    for each loop can process elements one by one only
    Syntax:
    for(datatype var: Array/Collection)
    {
    statements:
    }
 */
import java.util.*;
public class arraylistusingforeachloop {
    public static void main(String[] args) {
    List<Integer> list= new ArrayList<Integer>();
    for(int i=1; i<=5; i++)
    {
        list.add(i*5);
    }
        System.out.println("List is : ");
        for(int x:list)
            System.out.println(x);
    }
}

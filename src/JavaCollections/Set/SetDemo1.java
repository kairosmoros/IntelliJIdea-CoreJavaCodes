package JavaCollections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* ArrayList is ordered and allow duplicates
To remove duplicates in array, we simply convert into Set and display
 */
public class SetDemo1 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=4; i++)
        {
            list.add(i+2);
            list.add(i+3);
        }
        System.out.println("List is : " +list);
        Set<Integer> set= new HashSet<Integer>(list);
        System.out.println("Set : " +set);
    }
}

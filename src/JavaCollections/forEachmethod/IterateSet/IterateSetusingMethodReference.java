package JavaCollections.forEachmethod.IterateSet;
import java.util.*;
public class IterateSetusingMethodReference {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Set<Integer> set=new HashSet<>(list);
        set.forEach(System.out::println );

    }
}

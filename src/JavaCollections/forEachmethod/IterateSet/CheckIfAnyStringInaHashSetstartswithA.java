package JavaCollections.forEachmethod.IterateSet;
import java.util.*;
public class CheckIfAnyStringInaHashSetstartswithA {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Apple" ,  "Banana ", "Cherry"));
        set.forEach(s->
        {
            if(s.startsWith("A"))
            {
                System.out.println(s);
            }
        });
    }
}

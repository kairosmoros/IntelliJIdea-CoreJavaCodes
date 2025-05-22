package JavaCollections.CollectorsClass;

import java.awt.datatransfer.FlavorListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StoreIntoSpecificCollection {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        LinkedList<Integer> ll= list.stream().filter(x->x>2).collect(Collectors.toCollection(LinkedList::new));
        //note that here we are saying that I am going to store the data in LinedList
        /*
            Collectors.toSet() is also about storing stream elements in a Set.
So why do we need Collectors.toCollection(HashSet::new) at all?
Let me explain how they are similar and how they are different — this is very useful for interviews and deep understanding.

✅ 1. What Collectors.toSet() does:
It collects stream elements into a Set.
But the specific type of Set (like HashSet, LinkedHashSet, or TreeSet) is not guaranteed.
Usually, it returns a HashSet, but that's not fixed by contract.
Set<Integer> set = list.stream()
                       .collect(Collectors.toSet()); // Usually HashSet
                       So:
✅ Yes, Collectors.toSet() stores elements into a Set,
❌ But you don't control the exact type of Set.

✅ 2. What Collectors.toCollection(...) does:
It gives you full control to specify the exact type of collection.

For example: TreeSet, LinkedHashSet, LinkedList, etc.

Set<Integer> treeSet = list.stream()
                           .collect(Collectors.toCollection(TreeSet::new)); // You decide TreeSet
You can even use custom collection classes this way.
         */
        System.out.println(ll);

    }
}

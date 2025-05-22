package JavaCollections.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingElements {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,6);
       long collect=integers.stream().filter(x->x<4).collect(Collectors.counting());
       /*
       ✅ What is happening here?
integers.stream()
→ Creates a Stream from the list [1, 2, 3, 4, 5, 6, 6]

.filter(x -> x < 4)
→ Filters only elements less than 4, i.e. [1, 2, 3]

.collect(Collectors.counting())
→ Instead of collecting elements into a List or Set, this collects the number of elements that matched the filter.

The result of .collect(Collectors.counting()) is stored in Long collect
→ Because the result of .counting() is of type Long (not int)
        */
        System.out.println(collect);

    }
}

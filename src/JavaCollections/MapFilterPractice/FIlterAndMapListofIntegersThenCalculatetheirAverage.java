package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;

public class FIlterAndMapListofIntegersThenCalculatetheirAverage
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        double average=list.stream().filter(n-> n%2==0).mapToInt(Integer::intValue).average().orElse(0);

        /*
             When do we use .collect()?
             Use .collect() when you want to:
             Gather results back into a collection (e.g., List, Set, Map, etc.)
             But in your case:
             You're not interested in collecting.
             You're interested in computing a final result (the average).
             So .average() is the best and cleanest way.
         */
        System.out.println(average);
    }
}

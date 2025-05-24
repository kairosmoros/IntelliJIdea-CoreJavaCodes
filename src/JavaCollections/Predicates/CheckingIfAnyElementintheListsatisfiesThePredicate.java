package JavaCollections.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckingIfAnyElementintheListsatisfiesThePredicate {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven= num-> num%2==0;
        boolean anyEven=numbers.stream().anyMatch(isEven);
        /*
         What .anyMatch(...) Does:
        It returns true immediately if any one element matches the condition.
        It returns false if none of the elements match the condition.
        The result (either true or false) is stored in anyEven
         */
        System.out.println("Any even number? "+anyEven);
    }
}

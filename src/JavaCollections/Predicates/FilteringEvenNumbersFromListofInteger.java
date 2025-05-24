package JavaCollections.Predicates;
//If you have any doubt go and read About Predicate First line itself.
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringEvenNumbersFromListofInteger {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven= num-> num%2==0;
        /*
        "The rule is saved once in isEven. Each element from the stream is sent to that rule at the time it reaches the filter.
         The rule is applied then, and based on true/false, the element either goes forward or is skipped."


                A stream of elements comes from list.stream().
Then, filter(isEven) applies the rule (num % 2 == 0) to each individual element as it arrives.
If the result is true, the element goes to forEach and gets printed.
If false, the element is discarded at that point, and the next element is checked.


Predicate doesn't store values — it gives a decision (true/false) for each element in the stream, and only elements passing the test go further.

     Imagine isEven as a security guard at a gate:

The guard knows the rule: "Only even numbers are allowed."

Every person (element) comes up to the guard (the filter function).

The guard checks them at that moment — not before.

If they pass the rule (true), they go ahead. Otherwise, they’re turned away.

         */
        list.stream().filter(isEven).forEach(System.out::println);

    }
}

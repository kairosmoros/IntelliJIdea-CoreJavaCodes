package JavaCollections.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringStringsWithSpecificLengthfromAlistOfStrings {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","lichi" ,"banana" ," Orange", "grape" ,"kiwi");
        Predicate<String> hasSepecifiedLength= word-> word.length()==5;
        /*

        word -> word.length() == 5;
        word is a String
        .length() returns an int
        But the lambda returns true or false based on whether the length == 5

        Predicate<T> → means you're taking input of type T and deciding true/false based on that.
        You take Predicate<String> because you're checking each String.
        You're not storing strings or lengths, only the test logic.

        Predicate<String> hasSpecifiedLength = word -> word.length() == 5;
        Stores a rule: "If given a String, return true if its length is 5."
        .filter(hasSpecifiedLength) → sends each string to the rule.
        If true, goes to forEach. If false, skipped.

         */
        words.stream().filter(hasSepecifiedLength).forEach(System.out::println);

    }
}

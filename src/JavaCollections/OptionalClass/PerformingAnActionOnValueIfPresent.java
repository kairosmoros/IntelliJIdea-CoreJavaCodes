package JavaCollections.OptionalClass;

import java.util.Optional;

public class PerformingAnActionOnValueIfPresent {
    public static void main(String[] args) {
        Integer number=42;
        Optional<Integer> optionalNumber= Optional.of(number);
        optionalNumber.ifPresent(num->
        {
            int incrementedValue=num+10;
            System.out.println("Incremented value: " +incrementedValue);
        });
    }
}

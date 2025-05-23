package JavaCollections.OptionalClass;

import java.util.Optional;

public class CreateAnOptionalWithaNonNullValue {
    public static void main(String[] args) {
        String value="Prashant";

        // Optional.of(value) requires a non-null value.
        // If 'value' is null, it will throw NullPointerException.
        Optional<String> optionalValue=Optional.of(value);//This Optional.of(value) is saying it needs a value not null otherwise it will give error.
        // If the value is present inside the Optional, print it
        optionalValue.ifPresent(System.out::println);
    }
}

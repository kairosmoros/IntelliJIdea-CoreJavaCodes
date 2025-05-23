package JavaCollections.OptionalClass;

import java.util.Optional;

public class DisplaytheValueofStringOnlyifItisNotNull {
    public static void main(String[] args) {
        String value="Hello";
        Optional<String> optionalValue= Optional.of(value);
        System.out.println(optionalValue.get());

    }
}

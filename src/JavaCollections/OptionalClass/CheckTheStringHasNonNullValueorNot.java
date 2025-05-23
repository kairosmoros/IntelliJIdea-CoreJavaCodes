package JavaCollections.OptionalClass;

import java.util.Optional;

public class CheckTheStringHasNonNullValueorNot {
    public static void main(String[] args) {
        String value=null;
        Optional<String> optinalValue= Optional.ofNullable(value);
        System.out.println(optinalValue.isPresent());
   /*
     🔹 What isPresent() Actually Does:
        isPresent() checks if the Optional contains a non-null value.
        So:
        If the value is not null → Optional.ofNullable(value) wraps it → isPresent() returns true.
        If the value is null → Optional.empty() is returned → isPresent() returns false.
*/

    }
}

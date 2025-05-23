package JavaCollections.OptionalClass;
import java.util.Optional;
public class DIsplayDefaultValueinPlaceOfStringiftheStringValueisNULL {
    public static void main(String[] args) {
        String value="Prashant";
        Optional<String> optionalValue=Optional.ofNullable(value);
        /*  Flow Recap:
            Optional<String> optionalValue = Optional.ofNullable(value);
            System.out.println(optionalValue.orElse("Default"));
               🔹 Case 1: value is "Prashant"
                Optional.ofNullable("Prashant") → returns Optional[Prashant]
                optionalValue.orElse("Default") → returns "Prashant" ✅
               🔹Case 2: value is null
                Optional.ofNullable(null) → returns Optional.empty()
                optionalValue.orElse("Default") → returns "Default" ✅

            🔎 Key Insight:
            Optional is just a wrapper that can either:
            Contain a non-null value, or
            Be empty (if null was passed).

            You then decide how to safely extract or fallback using:
            orElse()
            orElseGet()
            orElseThrow()
            or transformation methods like map(), filter(), etc.
         */





        System.out.println(optionalValue.orElse("Default"));//Output: Default
        /*
        Here’s what’s happening:
value is null.
Optional.ofNullable(value) creates an empty Optional (because the value is null).
optionalValue.orElse("Default") returns the default value only when the Optional is empty.

✅ Output Analysis
If value = null → Output: "Default"
If value = "Prashant" → Output: "Prashant"

Let’s test the second case:
String value = "Prashant";
Optional<String> optionalValue = Optional.ofNullable(value);
System.out.println(optionalValue.orElse("Default"));  // Output: Prashant
So NO, it does not always return "Default". It only does so when the actual value is null or missing.
         */
    }
}

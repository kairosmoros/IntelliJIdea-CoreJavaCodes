package JavaCollections.OptionalClass;

import java.util.Optional;

public class CreatingAnOptionalWithANullableValue {
    public static void main(String[] args) {
        String value=null;
        Optional<String> optionalValue= Optional.ofNullable(value);
        optionalValue.ifPresentOrElse(System.out::println,()-> System.out.println("Default Value"));
     /*   🔍 What Is This Code Doing as a Whole?
🧠 Step-by-Step:
        String value = null;

        We're starting with a variable that could be null.

        Optional<String> optionalValue = Optional.ofNullable(value);

        We wrap the possibly-null value in an Optional.

        If value is null → this gives Optional.empty().

                If not null → this gives Optional[value].

        optionalValue.ifPresentOrElse(...)

        This is the main action:

        It says:

        If the optional has a value, print it.
                Otherwise, run an alternative (print “Default Value”).

🧪 In This Specific Case:
        value is null → so the Optional is empty.

                ifPresentOrElse() triggers the else part → prints "Default Value".

🧾 Output:

        Default Value
🎯 Why Do This Instead of Just an if?
        Good question! You could just write:

        if (value != null)
            System.out.println(value);
        else
            System.out.println("Default Value");

      */
    }
}

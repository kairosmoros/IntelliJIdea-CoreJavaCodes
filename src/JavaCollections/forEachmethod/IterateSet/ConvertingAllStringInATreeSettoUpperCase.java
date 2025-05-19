package JavaCollections.forEachmethod.IterateSet;
import java.util.*;
public class ConvertingAllStringInATreeSettoUpperCase {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>(Arrays.asList("apple" , "banana" , "cherry"));
        set.forEach(s->
        {
            String upperCase=s.toUpperCase();
            System.out.println(upperCase);
        }
       /*
                Here, you're using a lambda expression with a code block (curly braces {}) to define what to do for
                each element s in the set.
                If the lambda body is a single expression only, you can write it without curly braces:
                set.forEach(s -> System.out.println(s.toUpperCase()));
                If the lambda body contains multiple statements, then curly braces {} are required.
                In your case:
s -> {
    String upperCase = s.toUpperCase();
    System.out.println(upperCase);
}
This is not a single statement, but two statements:

Variable declaration: String upperCase = s.toUpperCase();

Print statement: System.out.println(upperCase);

That’s why you must use {}.
🛑 Why can't we remove curly braces?
Because Java needs to know where the multiple statements start and end. Without {}, Java assumes only one expression is allowed.

So this will give a compilation error:
// ❌ Invalid – multiple statements without curly braces
set.forEach(s ->
    String upperCase = s.toUpperCase();
    System.out.println(upperCase);
);
        */

        );

    }
}

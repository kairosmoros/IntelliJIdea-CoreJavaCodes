package JavaCollections.forEachmethod.IterateList;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingTheNumberOfOccurrenceOfASpecificStringInanArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> strings=new ArrayList<>(Arrays.asList("apple","banana" ,"cherry","apple"));
        String target="apple";
       // int count=0; //its allowed until inside the lambda it is Effectively final(means using this variable but not modifying it.
        // so use mutable object , like this
        AtomicInteger count=new AtomicInteger(0);//initialized to zero
        strings.forEach(s->
        {

            if(s.equals(target))// or can write it as if(s.equals("apple:)) it also counts for apple itself.
            {
                count.incrementAndGet();//now you're modifying safely!

               /*
                count++;
                If a variable is not declared as final, but you don’t change it, the compiler treats it as effectively final.

But if you try to change it, like:

count++;   // or   count = count + 1;
➡️ Then it’s no longer effectively final, and the lambda gives a compile-time error.

🧠 Why does this happen?
Java copies local variables (like count) into the lambda's scope — not the actual variable, but a snapshot of its value.

So, if you did this:
int count = 0;
strings.forEach(s -> {
    if (s.equals("apple")) {
        count++; // ❌ Not allowed!
    }
});
Java says:
"Hey, you're trying to change a local variable (count) inside a lambda — that’s not safe. You might think you’re changing count, but it’s actually a copy. I’ll block it."
"I see you're using a local variable (count) inside my lambda. I will treat it as a copied value, not the original. And since it's a copy, I cannot allow you to modify it, because changes won’t reflect outside — and that’s confusing and dangerous."


✅ Let’s visualize it:
❌ NOT Allowed:
int count = 0;
list.forEach(e -> count++); // ❌ Compiler error
✅ Allowed (effectively final):
int count = 0;
list.forEach(e -> {
    System.out.println("Element: " + e); // ✅ using count (not modifying)
});

✅ Solution: Use a mutable wrapper, like AtomicInteger:
AtomicInteger count = new AtomicInteger(0);
list.forEach(e -> {
    if (e.equals("apple")) {
        count.incrementAndGet(); // ✅ allowed
    }
});
                */
            }
        });
        System.out.println("Occurrences of " +target + " : " +count);
    }
}

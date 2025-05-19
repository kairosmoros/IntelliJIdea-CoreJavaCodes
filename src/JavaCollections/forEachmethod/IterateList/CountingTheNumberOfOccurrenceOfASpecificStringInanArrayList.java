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
        AtomicInteger count=new AtomicInteger(0);//initialized to zero and This reference is final (or effectively final)
        //final you know and effectively final means you are using it inside the lambda but when you don't modify then it is effectively final. ie;A variable is effectively final in Java **if:
        //It is assigned a value only once, and
        //That value is never changed (reassigned) after that.
        //And yes — this applies not just in lambdas, but also in anonymous classes, inner classes, etc.
        //You can use final explicitly (optional)
        /*
        final int count = 0; // Declared as final
         Runnable r = () -> System.out.println(count); // ✅ Also works
         But you don't have to write final explicitly — the compiler detects if the variable is effectively final.
         */

        strings.forEach(s->
        {

            if(s.equals(target))// or can write it as if(s.equals("apple:)) it also counts for apple itself.
            {
                count.incrementAndGet();//now you're modifying safely!
                /*
                With AtomicInteger, you’re not reassigning the variable, you're modifying the value inside the object.

Example:
AtomicInteger count = new AtomicInteger(0); // ✅ This reference is final (or effectively final)
list.forEach(s -> {
    if (s.equals("apple")) {
        count.incrementAndGet(); // ✅ Safe: modifying internal state
    }
});

System.out.println("Count of 'apple': " + count.get());
🧠 Key Point
You're not doing: count = new AtomicInteger(...); ← that would be reassignment ❌
You're doing: count.incrementAndGet(); ← that is mutation inside the same object ✅
So the reference to count is final, but the object it points to is mutable — and that's allowed!

🧪 Analogy
Imagine:
final List<String> list = new ArrayList<>();
You can do:
list.add("new item"); // ✅ modify contents
But you can’t do:
list = new ArrayList<>(); // ❌ reassigning — not allowed
Same idea applies to AtomicInteger.


                 */

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

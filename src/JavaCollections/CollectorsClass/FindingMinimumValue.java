package JavaCollections.CollectorsClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindingMinimumValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,6);
        int a=list.stream().collect(Collectors.minBy(Comparator.naturalOrder())).orElse(-1);
        /*
       1st way: One doubt which may arise in you mind that how do i know someone is returning the optional class the ansewer is simple here are some
        function which returns optional class against them you have to catch them i mean catch the actual value. Byheart them.
        Method/Library	                                    Return Type
        Stream.findFirst()	                                Optional<T>
        Optional.ofNullable(...)	                        Optional<T>
        Stream.findAny()	                                Optional<T>
        Stream.min()/max()	                                Optional<T>
        IntStream.average()         	                    OptionalDouble
        Map.get(key) (via Optional wrapper)	                Optional<T> (if wrapped manually)
        OptionalInt, OptionalLong, etc.	                    For primitive types
       2nd way: Another way is to hover over the different functions and check if anyone is return optional class if yes then use .get() or .orElse().
         */
       /*
       .collect(Collectors.minBy(Comparator.naturalOrder()))
This means:

Use a collector that finds the minimum element in the stream.

Comparator.naturalOrder() is used to compare elements in ascending order (smallest to largest).

🧠 Internally:

The stream passes its elements to minBy, which keeps track of the smallest value it has seen so far.

In the end, Collectors.minBy(...) returns an Optional<T> — here, it's Optional<Integer>.

3️⃣ .get()
Because .minBy(...) returns an Optional, we must call .get() to retrieve the actual value.

So:

Optional<Integer> opt = list.stream().collect(Collectors.minBy(...));
int a = opt.get(); // Extract the integer
✅ If the list is non-empty, .get() works fine.
❌ If the list is empty, .get() will throw a NoSuchElementException.

You can make it safer using .orElse(defaultValue) like:

int a = list.stream()
            .collect(Collectors.minBy(Comparator.naturalOrder()))
            .orElse(-1);
            What does .collect(Collectors.minBy(...)) return?
It returns an Optional<Integer>, not directly the integer.

An Optional is a wrapper class that may or may not contain a value.

Think of it like a "box" — you have to open it using .get() or .orElse(...) to get the actual value.

Optional<Integer> optional = list.stream()
                                 .collect(Collectors.minBy(Comparator.naturalOrder()));
Now:

optional.get() will return 1

optional.orElse(-1) will also return 1 (but safely)
        */
        System.out.println(a);//Yes — the actual minimum value is 1, because it’s the smallest number in the list.


    }
}

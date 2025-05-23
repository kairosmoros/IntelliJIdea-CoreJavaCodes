package JavaCollections.ParallelStream.ParallelStreamforArraySum;

import java.util.Arrays;

public class ParallelStreamforArraySum {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int sum= Arrays.stream(numbers).parallel().sum();
        /*
        Arrays.stream(numbers) creates an IntStream (primitive stream).

        .sum() on an IntStream returns a primitive int, not OptionalInt.

        So you do NOT need to use .orElse(...) here.

        ✅ That's why your code compiles and runs fine without .orElse.

        What if the array is empty?
        Even then, sum() returns 0:
        int[] empty = {};
        int sum = Arrays.stream(empty).parallel().sum(); // ✅ sum = 0
        It never throws or gives OptionalInt.



         */
        System.out.println("Sum of numbers: "+sum);
    }
}

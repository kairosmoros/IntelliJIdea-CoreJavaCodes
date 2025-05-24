package JavaCollections.Predicates;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class FilteringPositiveNumbersFormAnArrrayofDoubles {
    public static void main(String[] args) {
        double[] numbers={1,2,-3.4,5.6,-7.8,9.0};
        DoublePredicate isPositive= num-> num>0;
        Arrays.stream(numbers).filter(isPositive).forEach(System.out::println);
        /*
        🔍 Why the Error Happens:
            Arrays.stream(numbers) when numbers is a double[], produces a DoubleStream, not a stream of Double objects.
            But your Predicate<Double> is for Stream<Double>, not for DoubleStream.
            IntPredicate for int
            DoublePredicate for double

            If you were working with a List<Double>, then Predicate<Double> would work perfectly because the stream
            would be a Stream<Double>, not a DoubleStream.




         */
    }
}

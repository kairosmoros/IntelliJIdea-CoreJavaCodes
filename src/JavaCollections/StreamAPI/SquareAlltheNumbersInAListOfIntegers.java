package JavaCollections.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAlltheNumbersInAListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
       // list.stream().map(numbers->numbers*numbers).forEach(System.out::println);//This single line will also give the same result.
        List<Integer> squaredNumbers=list.stream().map(num-> num*num).collect(Collectors.toList());
        /*
            Here collect(Collectors.toList()) is used to collect the each element of list which is being modified in the new list with name squaredNumbers.
            Also under the hood collect(Collectors.toList()) uses the new ArrayList();
         */
        System.out.println(squaredNumbers);
    }
}

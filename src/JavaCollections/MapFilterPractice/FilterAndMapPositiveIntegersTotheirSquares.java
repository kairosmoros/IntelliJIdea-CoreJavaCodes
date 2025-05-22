package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapPositiveIntegersTotheirSquares {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(-1,-2,3,-4,5);
        List<Integer> squaresOfPositiveNumbers=numbers.stream().filter(n->n>0).map(n->n*n).collect(Collectors.toList());
        System.out.println(squaresOfPositiveNumbers);
    }
}

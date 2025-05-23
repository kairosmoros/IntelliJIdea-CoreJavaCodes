package JavaCollections.ParallelStream;

import java.util.Arrays;

public class ParallelStreamwithArray {
    public static void main(String[] args) {
        String[] names={"Alice" , "Neeraj" , "Charlie" , "David" ,"Eve"};
        Arrays.stream(names).parallel().forEach(System.out::println);
    }
}

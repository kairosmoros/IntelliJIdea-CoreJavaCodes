package JavaCollections.ParallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamOrdered {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,8,10);
        list.stream().parallel().forEachOrdered(System.out::println);
    }
}

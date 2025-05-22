package JavaCollections.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StoreinSet {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,6);
        Set<Integer> set=  integers.stream().map(x-> x*x).collect(Collectors.toSet());
        System.out.println(set);

    }
}

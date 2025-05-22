package JavaCollections.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractLengthsOfStringsInAList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple" , "banana" , "orange");
        List<Integer> lengths= fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);
    }
}

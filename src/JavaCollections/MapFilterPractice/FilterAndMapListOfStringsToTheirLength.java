package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapListOfStringsToTheirLength {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple" , "banana" , "orange" ,"grapes");
        List<Integer> wordsLengths=list.stream().filter(s-> s.startsWith("a")).map(String::length).collect(Collectors.toList());
        System.out.println(wordsLengths);
    }
}

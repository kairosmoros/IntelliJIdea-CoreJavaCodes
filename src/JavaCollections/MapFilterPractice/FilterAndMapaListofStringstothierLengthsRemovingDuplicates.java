package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapaListofStringstothierLengthsRemovingDuplicates {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple" , "banana" , "orange" , "grapes" , "apple");
        List<Integer> distinctWordLengths= list.stream().filter(s-> s.length()>4).map(String::length).distinct().collect(Collectors.toList());
        System.out.println(distinctWordLengths);
    }
}

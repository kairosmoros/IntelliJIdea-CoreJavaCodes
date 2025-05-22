package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapStringsToTheirUpperCaseVersions {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple" , "Banana" ," orange" , "Grapes");
        List<String> upperCaseWords=words.stream().filter(s-> s.length()>5).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseWords);
    }
}

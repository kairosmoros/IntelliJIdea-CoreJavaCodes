package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapaListofStringstoTheirLengthsFindtheMaximumLength {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple" , "banana" ,"orange" , "grapes");
        int maxLength=words.stream().filter(s->s.length()>5).mapToInt(String::length).max().orElse(0);
        System.out.println(maxLength);
    }
}

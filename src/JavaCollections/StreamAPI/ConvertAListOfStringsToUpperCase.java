package JavaCollections.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertAListOfStringsToUpperCase {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("Radha", "nicki", "Ellie","david Guetta"));
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

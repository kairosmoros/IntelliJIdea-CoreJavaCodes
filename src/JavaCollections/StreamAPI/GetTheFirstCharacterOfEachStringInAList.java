package JavaCollections.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetTheFirstCharacterOfEachStringInAList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("cat" , "dog" , "bird");
        List<Character> firstCharacters=list.stream().map(l-> l.charAt(0)).collect(Collectors.toList());
        System.out.println(firstCharacters);
    }
}

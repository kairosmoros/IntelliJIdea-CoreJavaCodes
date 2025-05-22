package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapAListofStringstothierUppercaseversionsthensortthem {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ram", "Ratan" , "Sohan" ,"Shyamanand" , "palak" , "Kartik" ,"Prashant");
        List<String> list1=list.stream().filter(s-> s.length()>3).map(String::toUpperCase).sorted().collect(Collectors.toList());
        /*
         .sorted()
         This sorts the strings in natural (lexicographical/alphabetical) order, AFTER they have been converted to uppercase.
         Important note: Uppercase letters sort before lowercase letters in Unicode, but here everything is already uppercase, so sorting is consistent.
         */
        System.out.println(list1);
    }
}

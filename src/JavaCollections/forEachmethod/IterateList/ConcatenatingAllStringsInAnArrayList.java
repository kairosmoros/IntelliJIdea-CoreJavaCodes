package JavaCollections.forEachmethod.IterateList;
import java.util.*;
public class ConcatenatingAllStringsInAnArrayList
{
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>(Arrays.asList("Hello", " " ,"World", "!"));
        StringBuilder sb=new StringBuilder();
        strings.forEach(sb::append);
        System.out.println(sb);
    }
}

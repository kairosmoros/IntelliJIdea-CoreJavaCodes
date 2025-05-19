package JavaCollections.forEachmethod.IterateList;
import java.util.*;
public class IteratingListMethodReference
{
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(10,20,30,40,45));
        list1.forEach(System.out::println);
    }
}

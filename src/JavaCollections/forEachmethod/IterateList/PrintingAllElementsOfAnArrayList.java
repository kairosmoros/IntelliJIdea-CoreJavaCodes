package JavaCollections.forEachmethod.IterateList;
import java.util.*;
public class PrintingAllElementsOfAnArrayList
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Banana" ," Apple " , "Cherry"));
        list.forEach(System.out::println);
    }

}

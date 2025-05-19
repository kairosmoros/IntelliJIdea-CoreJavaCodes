package JavaCollections.forEachmethod.IterateList;
import java.util.*;
public class DoublingValueinLinkedLIst {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        numbers.forEach(n-> System.out.println(n*2));
    }
}

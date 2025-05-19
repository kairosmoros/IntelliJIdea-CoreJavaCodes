package JavaCollections.forEachmethod.IterateList;
import java.util.*;
public class PrintingSquareOfEachElementInaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        list.forEach(n-> System.out.println(n*n));
    }
}

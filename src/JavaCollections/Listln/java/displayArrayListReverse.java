package JavaCollections.Listln.java;
import java.util.*;
public class displayArrayListReverse {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=5; i++)
            list.add(i*5);
        System.out.println("List is :");
        for(int i=list.size()-1; i>=0; i--)
            System.out.println(list.get(i));
    }
}

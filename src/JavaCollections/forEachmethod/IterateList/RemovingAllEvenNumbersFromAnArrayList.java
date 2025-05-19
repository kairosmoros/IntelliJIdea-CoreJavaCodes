package JavaCollections.forEachmethod.IterateList;
import java.util.*;
public class RemovingAllEvenNumbersFromAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.forEach(n->{if(n%2==0)
        {
            System.out.println(n);}
        });
    }
}

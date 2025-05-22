package JavaCollections.Filter;

import java.util.ArrayList;
import java.util.List;

public class ProgramToDisplayOnlyEvenNumbersIntheListUsingStreamAPI {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        List<Integer> list=new ArrayList<>();
        for(int x:arr)
            list.add(x);
        System.out.println("List is: " +list);
        System.out.println("Even numbers list is : ");
        list.stream().filter(s->s%2==0).forEach(System.out::println);
    }
}

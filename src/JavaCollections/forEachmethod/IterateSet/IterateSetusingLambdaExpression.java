package JavaCollections.forEachmethod.IterateSet;
import java.util.*;
public class IterateSetusingLambdaExpression {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Set<Integer> set=new HashSet<>(list);
        set.forEach(x-> System.out.println(x));
    }
}



        // OR You Can Write the Code like this too.

/*
public class IterateSetusingLambdaExpression {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        set.forEach(x -> System.out.println(x));
    }
}


 */
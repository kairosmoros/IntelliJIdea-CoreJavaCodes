package JavaCollections.forEachmethod.IterateList;
import java.util.*;
/*
java.util.* gives access to all utility classes (like List, Map, Set, Scanner, etc.).
It helps you avoid writing long package names.
But in serious/large codebases, it's better to import only specific classes to avoid confusion or namespace collisions
 */
/*public class CheckingIfALinkedListContainsASpecificValue {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        list.forEach(l->
        {if(list.contains(2))//here it is checking at each element as is this whole list contains 2 and each time yes and printing 1 then 2 and so on prints all elements.
            System.out.println(l);
        });
    }
}*/
public class CheckingIfALinkedListContainsASpecificValue {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int target=2;
        list.forEach(l->
        {if(l==2)//here it is comparing whether the particular element is matching or not with the target if yes then print that element else not so 2 is printed.
            System.out.println(l);
        });
    }
}
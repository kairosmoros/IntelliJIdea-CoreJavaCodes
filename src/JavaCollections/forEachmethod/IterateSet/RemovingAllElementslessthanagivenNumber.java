package JavaCollections.forEachmethod.IterateSet;
import java.util.*;
/*
java.util.* gives access to all utility classes (like List, Map, Set, Scanner, etc.).
It helps you avoid writing long package names.
But in serious/large codebases, it's better to import only specific classes to avoid confusion or namespace collisions
 */
/*
        public class RemovingAllElementslessthanagivenNumber {
        public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(5, 10, 15, 20));
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext())
        {
            Integer n=it.next();
            {
                if (n < 10) {
                    it.remove();
                }
            }
        }
    }
}
 */


/*
      OR Using forEach() method but the problem with forEach() method while removing element form map,set or list is that it throws exception .
        ie:
        Java’s collection classes like HashMap, HashSet, etc., throw this exception to prevent unexpected behavior when the structure of the collection changes during iteration. That means if you:
        Remove an element
        Add a new element
        while still inside a loop (or using .forEach()), Java detects this and throws ConcurrentModificationException.

        HashSet<Integer> numbers=new HashSet<>(Arrays.asList(5,10,15,20));
        numbers.forEach(n->
        {
        if(n<10)
        {
        numbers.remove(n);
        }
        });


 */


//Or we can remove each element less than given number as

public class RemovingAllElementslessthanagivenNumber
{
    public static void main(String[] args)
    {
            HashSet<Integer> set=new HashSet<>(Arrays.asList(5,10,20,30,40,50));
            set.removeIf(n-> n<10);//Removes all elements less than 10 safely
            set.forEach(System.out::println);//Prints remaining elements
    }
}


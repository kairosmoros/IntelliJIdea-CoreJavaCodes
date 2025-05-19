package JavaCollections.forEachmethod.IterateList;
/* forEach() introduced in JDK8 to iterate the collection
forEach() defined in both Iterable interface and in Stream interface
forEach() method is a Default method.
 */
// default void forEach(Consumer<superT>action)
/*
NOTE: forEach() method takes a single parameter which is a functional interface. So, you can pass lambda expression
or method reference as a input.

Defining a List:
 List<String> names= Array.asList("C", "Java", "Python");//the Array.asList() has fixed size .
  Using Lambda Expression.
  names.forEach(name -> System.out.println(name));
    Using Method reference
    names.forEach(System.out::println);

 */
import java.util.*;
public class IteratingList
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,29,39,49,59));
        list.forEach(x-> System.out.println(x));

    }
}

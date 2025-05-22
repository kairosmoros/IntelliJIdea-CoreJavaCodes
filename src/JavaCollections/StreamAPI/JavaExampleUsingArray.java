package JavaCollections.StreamAPI;
import java.util.Arrays;
import java.util.stream.Stream;
/*
      Stream in java are single use and lazy.
      If you don't consume the stream (eg. by using forEach, collect etc.), nothing happens.
     Real Life analogy .
 */
public class JavaExampleUsingArray {
    public static void main(String[] args) {
        String[] plainShirts ={"john" , "Emma" , "Raj"};
        //Create a stream and map each name to UpperCase (Simulate Printing).
        Stream<String> printedShirts= Arrays.stream(plainShirts).map(String::toUpperCase);
        /*
        (String::toUpperCase) think of it this way:
        if Stream<T>.map(classNmae::methodName)
        means: "For each element of type T, call the method methodName() that exists in className and is applicable to T"
        so; Stream<String>.map(String::toUpperCase)--valid
        Stream<Integer>.map(Integer::toUpperCase)--INVALID - no such method in Integer.

         */
        //Print the printed shirts
        printedShirts.forEach(System.out::println);
        //show the original array (plain shirts remain unchanged)
        System.out.println("Original Shirts: " +Arrays.toString(plainShirts));
        /*
        Arrays.toString(array) is a static utility method in the java.util.Arrays class.
        It doesn’t need your class or any overridden toString().
        It loops through the array and builds a string representation manually.
         NOTE: if you write like System.out.println("Original Shirts: " +toString(plainShirts)); it will print the memeory reference because arrays don't override object.toString() by default
         so when you write +Array.toString() it will by default override toStrng and call it each time the element in the array is accessed and since its already string it will return the same
         string back as output.

         */
    }
}

package JavaCollections.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapToConvertAllElementsinanArrayofStringstoUppercase {
    public static void main(String[] args)
    {
       String[] myArray=new String[]{"Harin" , "Ram" , "Annie" , "Shubham"};
     // Arrays.stream(myArray).map(String::toUpperCase).forEach(System.out::println); //You can also write this single line to print the same result.

        Stream<String> myStream = Arrays.stream(myArray);
        Stream<String> myNewStream=myStream.map(s-> s.toUpperCase());
        myNewStream.forEach(System.out::println);

    }
}

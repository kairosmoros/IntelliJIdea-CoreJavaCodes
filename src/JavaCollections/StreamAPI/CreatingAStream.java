package JavaCollections.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingAStream
{
    public static void main(String[] args)
    {
        List<Integer> myList=new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        Stream<Integer> stream= myList.stream();
        /* OR
            We can create streams for arrays as follows:
            Integer[] myArray={1,5,8};
            Stream<Integer> myStream =Arrays.stream(myArray);
         */
        /*
            OR
            Map to convert all elements in an array of Strings to uppercase:
            String [] myArray=new String[]{"Hariom", "Vishal", "Annie", "Akbar"};
            Stream<String> myStream = Arrays.stream(myArray);
            Stream<String> myNewStream =myStream.map(s-> s.toUpperCase());
         */
    }

}

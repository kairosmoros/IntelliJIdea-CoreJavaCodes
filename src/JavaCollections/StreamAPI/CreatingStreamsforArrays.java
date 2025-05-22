package JavaCollections.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsforArrays {
    public static void main(String[] args) {
        Integer[] myArray={1,5,8};
        Stream<Integer> myStream= Arrays.stream(myArray);
        myStream.forEach(s-> System.out.println(s));
        //myStream.forEach(System.out::println);//we can also write this
    }
}

package JavaCollections.StreamAPI;
import java.util.*;
import java.util.stream.*;
public class JavaExampleUsingList
{
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("Raman" , "Bhabha" ,"Jahangir" ,"Einstien"));
       // list.stream().map(String::toUpperCase).forEach(System.out::println);//we can also write this one line to get the same result.7777

        Stream<String> List=list.stream();
        Stream<String> myList=List.map(String::toUpperCase);
        myList.forEach(System.out::println);



    }
}

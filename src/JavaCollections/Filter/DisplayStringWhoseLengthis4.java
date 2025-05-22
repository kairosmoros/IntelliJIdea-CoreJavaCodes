package JavaCollections.Filter;

import java.util.ArrayList;
import java.util.List;

public class DisplayStringWhoseLengthis4
{
    public static void main(String[] args) {
        String []arr= {"java" , "Jdbc" ," Servlets" , "Spring"};
        List<String> list=new ArrayList<>();
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++)
            list.add(arr[i]);
        System.out.println(list);
        list.stream().filter(s-> s.length()==4).forEach(System.out::println);//this Displays String whose Length is 4.

    }
}

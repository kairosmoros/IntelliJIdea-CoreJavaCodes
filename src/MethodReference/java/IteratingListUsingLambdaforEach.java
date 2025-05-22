package MethodReference.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratingListUsingLambdaforEach {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("Ram" , "Shyam", "Suhani"));
        list.forEach(System.out::println);
        /* Or can write it as:
            list.forEach(s->System.out.println(s));
         */
    }
}

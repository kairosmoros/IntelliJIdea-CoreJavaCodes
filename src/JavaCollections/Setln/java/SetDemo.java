package JavaCollections.Setln.java;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(10);//duplicate
        System.out.println(set);
    }
}

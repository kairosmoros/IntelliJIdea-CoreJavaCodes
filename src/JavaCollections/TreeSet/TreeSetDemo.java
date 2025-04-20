package JavaCollections.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<Integer> treeset= new TreeSet<>();//in set no duplicates are allowed
       // treeset.add(null);//in java 1.7  null insertion in set was allowed but only as a first element
       //but after java 1.7 no insertion of null is not allowed
        treeset.add(10);
        treeset.add(20);
        treeset.add(50);
        treeset.add(40);//tree set uses bst and do sorting so it automatically shorts it
        //1.comparable(default by jvm) : eg: obj1.compareTo(object obj2);
        // when we write obj1.compareTo(object obj2)[here obj1 insert hone wala hai aur obj2 wo hai jo already inserte hai] then suppose if we write 2.compareTo(object 1) then it will compare 2
        //with 1 and  if 2==1 then 0 , if 2<1 then -ve , if 2>1 then +ve and accordingly sorts it and since it tree then bst comes in play
        System.out.println(treeset);
    }
}

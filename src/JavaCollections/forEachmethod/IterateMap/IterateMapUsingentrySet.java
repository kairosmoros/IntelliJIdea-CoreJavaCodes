package JavaCollections.forEachmethod.IterateMap;
import java.util.*;
public class IterateMapUsingentrySet
{
    public static void main(String[] args) {
        Map<Integer, String> names=new HashMap<>();
        names.put(1,"Prashant Yadav");
        names.put(2,"Ratan Singh");
        names.put(3, "Sekhar Vishwakarma");
        names.forEach((key,value)-> System.out.println(key+"  "+value) );

    }
}

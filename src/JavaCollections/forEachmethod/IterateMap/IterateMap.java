package JavaCollections.forEachmethod.IterateMap;
import java.util.*;
public class IterateMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"java");
        map.put(2,"Servlets");
        map.put(3,"JSP");
        map.forEach((k,v)->System.out.println(k+ " = " +v));
    }
}

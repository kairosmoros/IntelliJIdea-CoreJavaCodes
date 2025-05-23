package JavaCollections.ParallelStream;

import java.util.HashMap;
import java.util.Map;

public class ParallelStreamwithHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"One");
        map.put(2,"two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.entrySet().parallelStream().forEach(entry-> System.out.println(entry.getKey()+": "+entry.getValue()));
        /*
            Why entrySet()?
            The entrySet() method for a Map returns a Set of Map.Entry objects, where each entry represents one key-value
            pair.

            Why is that useful?
            Because streams work on collections, and Map itself isn't directly a collection of items like a List. So you
            need a way to convert to map into a streamable form.

            3 way to Stream a Map:
             Method                  	 Description
            map.keySet().stream()	    Stream of keys only
            map.values().stream()	    Stream of values only
            map.entrySet().stream() 	Stream of key-value pairs (Map.Entry) ✅
            Since you want both key and value, entrySet() is the correct choice.


            Why entry.getKey() and entry.getValue()?
            When you stream entrySet(), each element is a Map.Entry<k,v>. So to access:
                1. The key, you use entry.getKey().
                2. The value, you use entry.getValue()
            Example:
            For the entry (2,"two"), entry.getKey() is 2, and entry.getValue() is two.
         */
    }

}

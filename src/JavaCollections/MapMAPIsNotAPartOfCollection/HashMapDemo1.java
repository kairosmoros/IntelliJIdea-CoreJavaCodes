package JavaCollections.MapMAPIsNotAPartOfCollection;
import java.util.*;
public class HashMapDemo1
    /* 1. HashMap: doesn't maintain insertion order. Allows only one null key.
   2. LinkedHashMap: maintains insertion order . Allows only one null key
   3. TreeMap: maintains sorted order of keys. It doesn't allow null key.
   4. HashTable: It is called legacy class. It maintains sorted order. It doesn't allow null key.

 */
{//HashMap doesn't maintain insertion order . Allows only one null key.
    public static void main(String[] args) {
      // Map is always in key,value format ie; Map<Integer,String> ie Map<key,value> Or if Map<String , Integer> then
        // also key=String and value= Integer ie; <key,value>
        Map<Integer,String>map=new HashMap<>();
        map.put(10,"Ten");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Sixty");
        map.put(40,"Forty");
        map.put(50,"Fifty");
        System.out.println("Map : " +map);

    }
}

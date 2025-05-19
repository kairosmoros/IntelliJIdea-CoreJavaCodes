package JavaCollections.MapMAPIsNotAPartOfCollection;
/* 1. HashMap: doesn't maintain insertion order. Allows only one null key.
   2. LinkedHashMap: maintains insertion order . Allows only one null key
   3. TreeMap: maintains sorted order of keys. It doesn't allow null key.
   4. HashTable: It is called legacy class. It maintains sorted order. It doesn't allow null key.

 */

/*
    We can't iterate the map object either by using Iterator or using for-each loop.
    First we need to collect all keys of map using keySet() method.
    We iterate keys set and get values by specifying each key.
 */
import java.util.*;
public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String>map=new HashMap<Integer,String>();
        map.put(10,"Ten");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Forty");
        System.out.println("Map is : ");
        Set<Integer> keys =  map.keySet();
        //map.keySet() returns all the key stored in the Map
        //here inside the Set keys we have all the keys of map stored
        for (Integer key:keys)
        {
            //here we need key itself which is iteration not other value so map.get(key) is used.
            String value=map.get(key);
            //map.get(key) returns the value of that key.
            System.out.println(key+ " = "+value );

        }
    }
}

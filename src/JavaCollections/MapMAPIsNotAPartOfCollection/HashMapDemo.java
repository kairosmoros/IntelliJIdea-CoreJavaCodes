package JavaCollections.MapMAPIsNotAPartOfCollection;
/* 1. HashMap: doesn't maintain insertion order. Allows only one null key.
   2. LinkedHashMap: maintains insertion order . Allows only one null key
   3. TreeMap: maintains sorted order of keys. It doesn't allow null key.
   4. HashTable: It is called legacy class. It maintains sorted order. It doesn't allow null key.

 */
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Three" ,3);
        map.put("Two",2);
        map.put("One",4);
        System.out.println(map);
    }

    }


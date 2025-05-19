package JavaCollections.MapMAPIsNotAPartOfCollection;
import java.util.*;
/* 1. HashMap: doesn't maintain insertion order. Allows only one null key.
   2. LinkedHashMap: maintains insertion order . Allows only one null key
   3. TreeMap: maintains sorted order of keys. It doesn't allow null key.
   4. HashTable: It is called legacy class. It maintains sorted order. It doesn't allow null key.

 */
public class TreeMapDemo
{
    public static void main(String[] args) {
        Map<String,Integer > map=new TreeMap<>();
        map.put("Forty ", 40);
        map.put("Fifty " ,50);
        map.put("Thirty " ,30);
        map.put("Twenty " ,20);
        map.put("Ten " ,10);
        System.out.println("Map : "+map);
    }
    }


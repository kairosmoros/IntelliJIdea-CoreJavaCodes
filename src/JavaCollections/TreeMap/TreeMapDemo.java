package JavaCollections.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap= new TreeMap<>();
        treeMap.put("a",1);
        treeMap.put("b",3);
        treeMap.put("c",2);
        treeMap.put("e", 5);
        treeMap.put("d",4 );
        System.out.println(treeMap);

    }
}

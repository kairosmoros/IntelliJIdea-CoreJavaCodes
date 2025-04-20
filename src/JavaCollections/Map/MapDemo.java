package JavaCollections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two",2);
        map.put("Three" ,3);
        map.put("One",4);
        System.out.println(map);
    }

    }


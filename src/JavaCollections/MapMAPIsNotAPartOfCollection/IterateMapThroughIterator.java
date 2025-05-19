package JavaCollections.MapMAPIsNotAPartOfCollection;
import java.util.*;
public class IterateMapThroughIterator
{
    public static void main(String[] args) {
        String[] books = {"C", "C++", "JAVA","Python", "Android"};
        double[] prices={200.0,300.0,250.0,200.0,250.0};
        Map<String,Double> map=new HashMap<>();
        for(int i=0; i<books.length-1; i++)
        {
            map.put(books[i],prices[i]);
        }
        System.out.println("Map is: ");
        Set<String> keys =map.keySet();
        //map.keySet() returns all the keys which are inside the Map and is being store in the Set defined by the name keys.
        Iterator<String> itr =keys.iterator();
        while(itr.hasNext())
        {
            String key=itr.next();//here we are checking whether the itr.next() meaning we were initially at -1 position
            //now we are at index 0 by saying itr.next():
            Double value=map.get(key);//here map.get(key) gives the value for that key.
            System.out.println(key+ " = " +value);

        }


    }
}

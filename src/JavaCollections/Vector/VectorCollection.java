package JavaCollections.Vector;
import java.util.*;
public class VectorCollection {
    public static void main(String[] args)
    {
        Vector<Integer> v= new Vector<Integer>();
        for(int i=1; i<=5; i++)
        {
            v.add(i*5);
        }
        System.out.println("Vector : " +v);
    }
}

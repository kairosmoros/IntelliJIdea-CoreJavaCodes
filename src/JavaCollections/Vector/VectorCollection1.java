package JavaCollections.Vector;
//Enumerator Demo
import java.util.*;
public class VectorCollection1
{
    public static void main(String[] args)
    {
        Vector<Integer> v= new Vector<Integer>();
        for(int i=1; i<=5; i++)
        {
            v.add(i*5);
        }
        System.out.println("Vector : " +v);
        Enumeration<Integer> en= v.elements();
        while(en.hasMoreElements())
        {
            Integer x=en.nextElement();
            System.out.println(x);
        }
    }



}

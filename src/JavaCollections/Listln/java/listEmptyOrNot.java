package JavaCollections.Listln.java;
// isEmpty() method returns true if the list doesn't contains elements else returns false
import java.util.*;
public class listEmptyOrNot
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        if(list.isEmpty())
            System.out.println("list is empty ");
        else
            System.out.println("list contains elements");
    }
}

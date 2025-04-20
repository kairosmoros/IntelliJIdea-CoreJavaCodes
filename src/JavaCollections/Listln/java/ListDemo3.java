package JavaCollections.Listln.java;
import java.util.ArrayList;
import java.util.List;
public class ListDemo3
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        if(list.isEmpty())
        {
            System.out.println("list is empty ");
        }
        else {
            System.out.println("list is  not empty ");
        }
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
    }
}

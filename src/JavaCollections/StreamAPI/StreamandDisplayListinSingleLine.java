package JavaCollections.StreamAPI;
import java.util.*;
import java.util.stream.*;
public class StreamandDisplayListinSingleLine
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.stream().forEach(x -> System.out.println(x));
    }

}


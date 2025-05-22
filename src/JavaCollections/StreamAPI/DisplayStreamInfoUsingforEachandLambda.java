package JavaCollections.StreamAPI;
import java.util.*;
        import java.util.stream.*;
public class DisplayStreamInfoUsingforEachandLambda
{
    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Stream<Integer> st=list.stream();
        st.forEach(x-> System.out.println(x));
    }
}

package JavaCollections.ParallelStream;

import java.util.LinkedList;
import java.util.List;

public class parallelstream1 {
    public static void main(String[] args) {
        List<String> colors= new LinkedList<>();
        colors.add("Red"); colors.add("Green"); colors.add("Blue"); colors.add("Yellow"); colors.add("Purple");
        colors.parallelStream().forEach(System.out::println);
    }
}

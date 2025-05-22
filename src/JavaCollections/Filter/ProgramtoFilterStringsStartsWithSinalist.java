package JavaCollections.Filter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramtoFilterStringsStartsWithSinalist {
    public static void main(String[] args) {
       List<String> list=new ArrayList<String>();
       list.add("Java"); list.add("JDBC"); list.add("Servlets"); list.add("JSP"); list.add("Spring"); list.add("Hibernate)");
      /*
       Stream<String> st= list.stream();
       Stream<String>res=st.filter(s-> s.startsWith("S"));
       res.forEach(System.out::println);

       */
       //           OR(In One Line)

        list.stream().filter(s-> s.startsWith("S")).forEach(System.out::println); //in single line






    }
}

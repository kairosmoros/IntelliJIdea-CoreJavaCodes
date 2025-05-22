package JavaCollections.MapFilterPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person
{
    private String name;
    private float age;
   public Person(String name, float age)
   {
       this.name=name;
       this.age=age;
   }
   public float getAge()
   {
       return this.age;
   }
   public String getName()
   {
       return this.name;
   }

    @Override
    public String toString() {
       return "{" +name + "," +age+"}";
    }
}
public class FilterAndMapListOfObjects {
    public static void main(String[] args) {
        List<Person> persons= Arrays.asList(new Person("John" ,25), new Person("Prashant", 30), new Person("Bob",40));
        /*
        Arrays.asList(...) allows you to create a fixed-size list from elements.
        You’re passing new Person objects into that list.
        It works only when Person is defined properly with a constructor that matches (String, int).
         */
        List<Person> person=persons.stream().filter(s-> s.getAge()>26).collect(Collectors.toList());
        System.out.println(person);
        //                  OR can Write like this
        //List<String> personNameWhoseAgeGreaterthan26=persons.stream().filter(s-> s.getAge()>26).map(Person::getName).collect(Collectors.toList());
        //System.out.println(personNameWhoseAgeGreaterthan26);
    }
}

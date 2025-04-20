package JavaCollections.PrimitiveAndWrapperClass;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PrimitiveAndWrapperDemo
{
    public static void main(String[] args) {
        //Primitive type
        int primitiveValue=5;
        //Wrapper class
        Integer wrapperValue=5;//outboxing
        //You CANNOT do this;
        // List<int> listofPrimitves= new ArrayList<>()//This is invalid
        //But you can do this:
        List<Integer> listofWrappers= new ArrayList<>();
        listofWrappers.add(primitiveValue);// outboxing: int->Integer
        listofWrappers.add(wrapperValue); //already and Integer
        System.out.println("Primitve value: " +primitiveValue);
        System.out.println("Wrapper value: " +wrapperValue);
        System.out.println("List of wrappers: "+listofWrappers);
        //Showing object behavior:
        System.out.println("Wrapper class allows methods:");
        System.out.println("Max value of Integer: " +Integer.MAX_VALUE);
        System.out.println("Binary of 10: " +Integer.toBinaryString(10));
        //But this won't work  with primitive:
        //primitiveValue.toString();// CANNOT call method on primitive
    }
}
/* ✅ Key Differences Highlighted:

Feature	                     Primitive (int, etc.)      	Wrapper (Integer, etc.)
Stored in memory as	            Raw value (stack)	         Object (heap)
Can be null?	                ❌ No                          ✅ Yes
Can call methods?	            ❌ No	                       ✅ Yes
Used in collections?	        ❌ No	                       ✅ Yes
Autoboxing support?	            ➖ Not applicable              ✅ (int ↔ Integer)
*/

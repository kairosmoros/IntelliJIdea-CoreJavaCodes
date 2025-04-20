package string;
import java.util.Arrays;
public class stringdemo1
{
    public static void main(String[] args) {

        //length
        String s="Prashant Yadav";
        System.out.println(s.length());//14

        //concatenation
        String s1="Prashant";
        String s2= "Yadav";
        String s3=s1+s2;
        System.out.println(s3);//Prahant Yadav

        //toCharArray()
        // The toCharArray() method in Java is a method of the String class that converts a String into an array of characters (char[]). It is useful when you need to work with the individual characters of a string in a more flexible or efficient way, such as iterating, modifying, or passing the characters to methods that require a char array.
        //Syntax
        //public char[] toCharArray()
        //Return Type: char[] (an array of characters).
        //Parameters: None.
        //Description: Returns a new char array containing the characters of the string in the same order.
        String s4 ="Prashant";
        char[] arr = s4.toCharArray();
        System.out.println("to char array = " + Arrays.toString(arr));
        //or
        /*Use Cases of toCharArray()
        Iterating Over Characters:
        When you need to process each character of a string individually, toCharArray() provides a convenient way to access characters as an array.
        ie;
         */
        String str="hello";
        char[] charArray = str.toCharArray();
        for (char c : charArray)
        {
            System.out.println(c);
        }
        //or
       /* Modifying Characters:
        Strings in Java are immutable, so you cannot modify a string's characters directly. By converting a string to a char array, you can modify the array's elements and then create a new string if needed.

        */





        String str1 = "Hello";
        /* Step 1: String str1 = "Hello"
What Happens:
The string literal "Hello" is created in the String Constant Pool (SCP), a special area of the heap, if it doesn’t already exist.
The variable str1 is a reference that points to this "Hello" object in the SCP.
Memory:
SCP: "Hello".
Non-pool heap: None.
str1 → SCP:"Hello".
*/





        char[] charArray1 = str1.toCharArray();

/* Step 2: char[] charArray1 = str1.toCharArray()
What Happens:
The toCharArray() method creates a new char array in the non-pool heap (regular heap memory, outside the SCP).
This array is a copy of the characters of "Hello": ['H', 'e', 'l', 'l', 'o'].
charArray1 is a reference that points to this char array in the non-pool heap.
The original "Hello" in the SCP remains unchanged.
Memory:
SCP: "Hello".
Non-pool heap: char[] with ['H', 'e', 'l', 'l', 'o'].
str1 → SCP:"Hello".
charArray1 → Non-pool heap:['H', 'e', 'l', 'l', 'o'].
*/








        /*The toCharArray() method creates a new char array in the non-pool heap (not SCP) containing a copy of the
        characters of "Prashant": ['P', 'r', 'a', 's', 'h', 'a', 'n', 't'].
        The original "Prashant" in the SCP remains unchanged.
        charArray references this char array in the non-pool heap.

        Memory:
        scp: "prashant"
        Non-pool heap: char[] with ['P', 'r', 'a', 's', 'h', 'a', 'n', 't']
        s1 -> scp:"prashant"

        chrArray -> Non - pool heap : ['P','r', 'a', 's', 'h', 'a', 'n', 't']
        charArray[0] ='J' , this modifies the first element of the char array in the non-pool heap to 'J'.
        The array now contains: ['J', 'r', 'a', 's', 'h', 'a', 'n', 't']
        This code does not effect the original "Prashant" in the SCP , as the char array is a seperate copy.
        */
        /* String newstr= new String(charArray)
        * The String(char[]) constructor creates a new String object in the non-pool heap by copying the characters from
        * charArray ('J','r','a', 's', 'h', 'a','n', 't'])
        * The content of this new String is "Jrashant"
        * Unlike string literal, the strin "Jrashant" is not automatically created in the scp , The new String object resides
        * only in the non-pool heap unless explicitly interned (eg., newstr.intern())
        * newstr points to this new String object in the non-pool heap.
        *
        * */
        charArray1[0] = 'J'; //Modify first character
        /*charArray1[0] = 'J'
What Happens:
The first element of the char array in the non-pool heap is modified from 'H' to 'J'.
The array now contains: ['J', 'e', 'l', 'l', 'o'], which represents the characters of "Jello".
This modification occurs in the non-pool heap and does not affect the original "Hello" in the SCP.
Memory:
SCP: "Hello".
Non-pool heap: char[] with ['J', 'e', 'l', 'l', 'o'].
str1 → SCP:"Hello".
charArray1 → Non-pool heap:['J', 'e', 'l', 'l', 'o'].
 */




        String newStr = new String(charArray1);//crating new string
        /* String newStr = new String(charArray1)
What Happens:
The String(char[]) constructor creates a new String object in the non-pool heap by copying the characters from charArray1 (['J', 'e', 'l', 'l', 'o']).
The content of this new String is "Jello".
Important: The string "Jello" is not automatically created in the SCP because it is not a string literal (e.g., "Jello" in the code) and the String(char[]) constructor does not intern the string. The new String object exists only in the non-pool heap unless explicitly interned (e.g., newStr.intern()).
newStr points to this new String object in the non-pool heap.
Memory:
SCP: "Hello".
Non-pool heap:
char[] with ['J', 'e', 'l', 'l', 'o'].
String with "Jello".
str1 → SCP:"Hello".
newStr → Non-pool heap:String("Jello").



*/

        System.out.println(newStr);//
        /*
        Step 5: System.out.println(newStr)
What Happens:
Prints the content of the String object referenced by newStr, which is "Jello".
Output: Jello.
Your Analysis: Correct.
You stated: “Here it prints Jello.”
This is accurate. The newStr variable points to a String object with content "Jello", so printing it outputs Jello.
         */




        //charAt()
        String s11= "leela";
        System.out.println("char at = " +s11.charAt(1));//e

        //compareTo()
        String s12= "hello";
        String s13="hello";
        String s14= "hellb";
        String s15="hat";
        String s16="Not";
        int res = s12.compareTo(s13);
int res1= s12.compareTo(s14);
int res2= s13.compareTo(s15);
int res3 = s14.compareTo(s15);
int res4= s15.compareTo(s16);
int res5=s16.compareTo(s15);//giving negative since in dictionary not comes after hat

        /*The compareTo() method is used to compare two strings lexicographically based on the Unicode values of their characters. It returns:

A negative number if the calling string comes before the other string.
Zero if the strings are equal.
A positive number if the calling string comes after the other string.
 */
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        // content comparison equals()
        System.out.println(s12.equals(s13));

        //contains()
        String s17="hello Prashant welcome to the development universe ";
        System.out.println(s17.contains("Prashant "));
        System.out.println(s17.contains("Developer"));

        //indeOf()
        System.out.println(s15.indexOf('a'));

        //replace()
        String ss="hello world ";
        String s9 = ss.replace("hello" , "Prashant");
        System.out.println(s9);

        //subString()

        //  beginIndex: The starting index (inclusive, meaning the character at this index is included).
       //  endIndex: The ending index (exclusive, meaning the character at this index is not included).
        String r1="hello Prashant welcome to the development universe ";
        String r2=  r1.substring(0,7);//0 --- end-1
        String r3= r1.substring(4);// 0 --- end-1

        System.out.println(r2);
        System.out.println(r3);

    }
}

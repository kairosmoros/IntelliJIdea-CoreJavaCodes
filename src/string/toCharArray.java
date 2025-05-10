package string;

import java.util.Arrays;

public class toCharArray {
    public static void main(String[] args) {
        String s4= "Prashant Yadav";
        char []arr=s4.toCharArray();
        /*
char[] arr = s4.toCharArray();
What it does:
It converts the String "Prashant Yadav" into a character array.
Each character (including space) becomes an element in a new char[].
Memory details:
A new char array is created in the heap memory.
The reference arr points to this new array.
Important:
toCharArray() does not modify the original string.
It creates a new array, copying characters from the string.
*/
        System.out.println("to char Array = " + Arrays.toString(arr));
        /*
System.out.println("to char Array = " + Arrays.toString(arr));
What it does:
Arrays.toString(arr) converts the char[] into a formatted string like this:
[P, r, a, s, h, a, n, t,  , Y, a, d, a, v]
It’s just a pretty way of printing an array.
*/
    }

}
/* ✅ String Array (String[] arr = new String[10];)
java
Copy
Edit
arr[0] = "Prashant";
arr[1] = "Yadav";
Index	Value
0	"Prashant"
1	"Yadav"
2	null
...	...

✅ Each index holds a whole string (like a word).

✅ You can access arr[0] → "Prashant", arr[1] → "Yadav".

2. ✅ Character Array (char[] arr = "Prashant Yadav".toCharArray();)
Index	Value
0	'P'
1	'r'
2	'a'
3	's'
4	'h'
5	'a'
6	'n'
7	't'
8	' ' (space)
9	'Y'
10	'a'
11	'd'
12	'a'
13	'v'

✅ Each index holds one character only.

✅ So yes, as you said:

arr[1] = 'r'

arr[8] = ' ' (space)

arr[9] = 'Y'

📌 So in simple terms:
Array Type      	Index Refers To
String[]	        A whole string (word/sentence)
char[]	            A single character*/
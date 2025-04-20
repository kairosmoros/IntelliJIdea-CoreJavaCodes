package JavaCollections.Vector;

import java.util.Enumeration;
import java.util.Vector;

class VectorDemo1
{
    public static <Interger> void main(String[] args) {
        Vector<Integer> vector= new Vector();
        vector.addElement(90);
        vector.addElement(30);
        vector.addElement(40);
     //   vector.addElement("Prashant Yadav");//You can't add since you gave the generic as Integer like Vector<Integer> so only integer can be given to store it
        System.out.println(vector);
        Enumeration e= vector.elements();
        System.out.println(e);
        /* . What is Enumeration?
Enumeration is an interface in Java, part of the java.util package. It was introduced to iterate over collections (like vectors) in a sequential manner.
It provides two main methods:
hasMoreElements(): Checks if there are more elements to iterate over.
nextElement(): Returns the next element in the iteration.
In modern Java, Enumeration is considered legacy and has been largely replaced by the Iterator interface. However, it is still supported in older classes like Vector.
2. What is happening at vector.elements()?
The elements() method is a method of the Vector class. It returns an Enumeration object that allows you to iterate over the elements stored in the vector.
Internally, vector.elements() creates and returns an instance of a private inner class (typically Vector$Enumeration) that implements the Enumeration interface. This object is specifically designed to traverse the Vector's elements one by one.
So, vector.elements() does not create the elements themselves but rather an iterator-like object (an Enumeration) that can access the existing elements in the vector.
3. What is e?
e is a reference variable of type Enumeration. It is assigned the Enumeration object returned by vector.elements().
This reference e is used to control the iteration process in the while loop that follows. It holds the state of the iteration and allows you to call hasMoreElements() and nextElement() to process each element in the vector.
4. How does it work in the code?
At line 15, Enumeration e = vector.elements(); initializes e with an Enumeration object that is tied to the vector's contents.
In the while loop:
e.hasMoreElements() checks if there are more elements to process.
e.nextElement() retrieves the next element from the vector and moves the internal pointer forward.
The retrieved element is cast to Integer (as data) because the vector is declared as Vector<Integer>, and then printed.
 */
        while(e.hasMoreElements())
        {
            Integer data= (Integer) e.nextElement();//Typecasting in Integer since only the integer is there in the vector
            System.out.println(data);
        }
    }
}


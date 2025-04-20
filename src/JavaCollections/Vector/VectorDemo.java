package JavaCollections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args) {
        Vector vector= new Vector();
        vector.addElement(90);
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(10);
        vector.addElement("Prashant Yadav");//vector can contain heterogemous elements too
        System.out.println(vector);
        Enumeration elements = vector.elements();//elements() is a method in vector which return object of type Enumeration
        while(elements.hasMoreElements())
        {
            Object o= elements.nextElement();//object is the parent class of everyone so it will store heterogenous elements too
            System.out.println(o);
        }
    }
}

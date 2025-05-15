package JavaCollections.StackCollection;
import java.util.*;

public class StackCollectionDemo1 {
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<Integer>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println("Stack is: " +stk);
        System.out.println("Pop : " +stk.pop());
        System.out.println("pop : " +stk.pop());
        System.out.println("Stack is : " +stk);

        stk.push(50);
        stk.push(60);
        System.out.println("Stack is: " +stk);

        System.out.println("Peek : " +stk.peek());
        System.out.println("Peek : " +stk.peek());
        System.out.println("Stack is : " +stk);
    }
}

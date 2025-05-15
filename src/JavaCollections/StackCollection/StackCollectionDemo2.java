package JavaCollections.StackCollection;

import java.util.Scanner;
import java.util.Stack;

/*
Stack Operations - Menu Driven Program
 */
public class StackCollectionDemo2
{
    public static  void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> stk= new Stack<>();
        while(true)
        {
            System.out.println("1. Push \n 2. Pop \n 3. Display \n 4. Peek \n 5. Quit");
            System.out.println("Enter Choice : ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter element ot push : ");
                int ele= sc.nextInt();
                stk.push(ele);
                System.out.println("Element pushed into the stack ");
            }
            else if(ch==2)
            {
                if(stk.empty())
                {
                    System.out.println("Empty Stack ");
                }
                else System.out.println("pop : " +stk.pop());

            }
            else if(ch==3)
            {
                if(stk.empty())
                {
                    System.out.println("Empty stack ");
                }
                else System.out.println("Stack is : " +stk);
            }
            else if(ch==4)
            {
                if(stk.empty())
                    System.out.println("Empty stack");
                else System.out.println("Peek : " +stk.peek());
            }
            else if(ch==5)
            {
                System.out.println("The End");
                System.exit(1);
            }
            else System.out.println("Invalid choice");
        }

    }
}

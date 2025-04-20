package variabletypedemo;

import java.util.Scanner;

public class UserInputScanner2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();//Clears buffer before nextLine()
        /* sc.nextInt() reads only the number, but does not consume the Enter key (newline character \n).
            That leftover newline just sits in the buffer.
            When you call sc.nextLine() next, it thinks:
            "Oh, there’s already a newline here? I’ll just return an empty string!"
             So if you don’t handle that leftover newline, your input will be skipped or wrong.
             */
        String[] names= new String[n];
        System.out.println("Enter names: ");
        for(int i=0; i<n; i++)
        {
            names[i]=sc.nextLine();//Read full names
        }
        System.out.println("Names entered: ");
        for(String name : names)
        {
            System.out.println(name);
        }
        sc.close();
    }
    
}

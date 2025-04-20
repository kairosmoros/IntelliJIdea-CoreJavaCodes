package UserInputScannerDemo;
import java.util.Scanner;
public class UserInputScanner2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");//here when cursor moves down automatically it is due to ide
        int age= sc.nextInt();//reads 25, leaves '\n' since it can only take integer
       // sc.nextLine();//it clears the left over
        System.out.println("Enter name: ");
        String name= sc.nextLine();//reads leftover '\n' (empty) and thinks that user has given the input and prints it which is empty
        // //now to handle this problem just write the code in the comment section in line 10
        sc.nextLine();//this again clears the enter key you have pressed

        System.out.println("Name is: " +name);//output will be empty
        sc.close();


    }
}


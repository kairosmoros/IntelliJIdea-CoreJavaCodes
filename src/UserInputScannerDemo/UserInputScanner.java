package UserInputScannerDemo;

import java.util.Scanner;
public class UserInputScanner
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);//create scanner object
        /*
         * System.in is the standard input stream(keyboard)
         * Scanner sc= new Scanner(System.in); creates a scanner to read the user input.
         * nextLine() reads the whole line ( useful for full names).
         *  */
        System.out.println("Enter you name: ");
        String name = s.nextLine(); //Takes full line ipput
        System.out.println("Enter your age: ");
        int age= s.nextInt();
        System.out.println("Hello " +name+ ", you are " + age + " years old.");
        s.close();
    }
}

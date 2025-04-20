package UserInputScannerDemo;

import java.util.Scanner;

public class UserInputScanner4
{
    public static void main(String[] args)//main is a method inside the UserInputScannerDemo.UserInputScanner4
    {
        Scanner s = new Scanner(System.in);
        int sum=0;
        /* In the provided Java code, the variable sum is declared inside the for loop, which means it is scoped to that block. When you declare a variable inside a block (like a loop), it is only accessible within that block. In your code, sum is re-initialized to 0 with each iteration of the loop, and its value is lost after the loop ends. This is why you cannot use sum outside the loop or resolve it as you expect. */
        System.out.println("Enter 5 integers which you wish for: ");
        for (int i=0; i<5; i++)
        {
            int num =s.nextInt();
            /*
            The for (int i = 0; i < 5; i++) loop runs 5 times (when i is 0, 1, 2, 3, 4).
Inside the loop, int num = s.nextInt(); waits for you to enter an integer and press Enter. This is why it pauses each time—nextInt() is a blocking call, meaning it waits for user input before proceeding.
After you enter a number (e.g., 5), sum += num adds it to sum (so sum becomes 5, then 10, 15, etc., as you enter more numbers).
This repeats 5 times because the loop condition i < 5 holds true until i reaches 5.
Loop Exit:
Once i becomes 5 (after the 5th iteration), the loop condition i < 5 becomes false, and the program exits the loop.
It then prints sum = followed by the total (e.g., if you entered 5, 5, 5, 5, 5, it prints sum = 25).
Finally, s.close() closes the scanner, and the program ends.
*/
            sum += num;
        }
        System.out.println("sum =" +sum);
        s.close();


    }
}

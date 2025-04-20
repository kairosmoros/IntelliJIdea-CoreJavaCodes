package UserInputScannerDemo;
import java.util.Scanner;
public class UserInputScanner3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n= sc.nextInt();
        sc.nextLine();//clear buffer before nextLine()
        String[] names= new String[n];
        System.out.println("Enter names: ");
        for(int i=0; i<n;i++)
        {
            names[i]=sc.nextLine();//Reads full names
        }
        System.out.println("Names entered: ");
        for(String name:names)
        {
            System.out.println(name);
        }
        sc.close();
    }

}

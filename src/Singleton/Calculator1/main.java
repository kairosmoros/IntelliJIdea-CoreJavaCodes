package Singleton.Calculator1;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
        {
            Scanner sc=new Scanner(System.in );
            System.out.println("Enter two numbers to add: ");
            int a=sc.nextInt();
            sc.nextLine();
            int b=sc.nextInt();
            Calculator calc =  Calculator.getInstance();
            System.out.println("sum = " +calc.add(a,b));

        }
    }
}

package Singleton.Calculator;

public class main
{
    public static void main(String[] args) {
        // Simulate 10 users doing addition
        for(int i=1; i<=10; i++)
        {
            Calculator calc= Calculator.getInstance();// All get the same object
            System.out.println(calc);// it must show the same hash Code
            int a=i*2;
            int b= i*3;
            int result= calc.add(a,b);
            System.out.println("Person" +i+ " : " +a+ " + " +b+ " = " +result);
        }
    }
}

package Project1UsingCoreJava;

import java.util.Scanner;

public class PanAadhaarMatcherApp
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        System.out.println("Enter the Aadhaar Number: ");
        String aadhaarNumber=sc.nextLine();
        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan= panService.getPanByAadhaarNumber(aadhaarNumber);
        if(aadhaar != null && pan!=null)
        {
            System.out.println("Aadhaar Details = " +aadhaar);//Here I have given sout(adhaar) so it will automatically trigger the toString() of class Aadhaar because the object reference is of class Aadhaar
            System.out.println(" Pan Details =" +pan );//Here I have given sout(pan) so it will automatically trigger the overriden toString() of class Pan because the object is of class Pan

        }
        else {
            System.out.println("No Match found");
        }
    }
}

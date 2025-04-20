package Typecasting;

public class Typecastingdemo {
    public static void main(String[] args) {
        int a=10;
        System.out.println("the integer value is: " +(++a));
        //converting int type to double
        double data=a;//8 B
        System.out.println("the double value: " +data);
        double num=10.99;
        System.out.println("the double value: " +num);
        //converting double into int
        int b=(int) num;
        float d=10.9f;//float syntax
        System.out.println("unless and untill you apply f ie 10.9f the compiler will take it as double only");
    }
}

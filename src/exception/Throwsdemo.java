package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class ThrowTest
{
    void m1() throws IOException
    {
        m2();
    }
    void m2() throws IOException
    {


        BufferedReader reader= new BufferedReader(new FileReader(":D/"));

        //now here I will not write try and catch since m2() doesn't want to take the responsibility of handlening the exception
        //Instead it is giving it to the one who called it that is m1() by writing the keyword throws ( it  means giving
        // the responsibility to someone)
    }
}

public class Throwsdemo
{
    public static void main(String[] args) throws IOException/*here main is also not taking the responsibility and giving it to the jvm*/
     {
        ThrowTest test = new ThrowTest();
        test.m1();

    }
}

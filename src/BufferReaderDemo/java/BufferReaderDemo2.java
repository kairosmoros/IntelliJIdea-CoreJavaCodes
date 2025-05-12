package BufferReaderDemo.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Your full Name: ");
        String name=bfr.readLine();
        System.out.println("welcome to java world Mr. " +name);

    }
}

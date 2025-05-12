package BufferReaderDemo.java;
import java.io.*;
public class BufferReaderDemo1
{
    public static void main(String[] args) throws IOException {
        //step 1: Wrap System.in inside InputStreamReader
        InputStreamReader isr= new InputStreamReader(System.in);
        //step 2: Wrap InputStreamReader inside BufferReader
        BufferedReader br= new BufferedReader(isr);
        //step 3: Read data(only String)
        System.out.println("Enter your name: ");
        String name= br.readLine();//read full line
        System.out.println("Hello "+name);

    }

}


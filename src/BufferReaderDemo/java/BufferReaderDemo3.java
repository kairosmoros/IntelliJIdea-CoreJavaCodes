package BufferReaderDemo.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo3
{
    public static void main(String[] args) throws IOException {
        //step1: create a BufferReader object linked to standard input
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //step2: Prompt user
        System.out.println("Enter multiple lines of text(press Enter on empty line to stop):");
        //step3: Declare a String to hold each line
        String line;
        //step4: Read line-by-line until user enters empty input
        while((line=br.readLine()) != null && !line.isEmpty() )
        {
            //step 5: Process each line (here, simply print it)
            System.out.println("You Entered: " +line);
        }
        System.out.println("Input reading finished.");
    }
}

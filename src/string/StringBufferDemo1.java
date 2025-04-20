package string;

public class StringBufferDemo1
{
    public static void main(String[] args)
    {//STRING BUFFER
        StringBuffer sb= new StringBuffer("Prashant ");
        sb.append("Yadav");
        System.out.println(sb);

        //STRING
        String s1= "hello";
        String s2= s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

    }
}

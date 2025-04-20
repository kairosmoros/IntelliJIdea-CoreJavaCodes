package string;

public class StringBufferDemo2
{
    public static void main(String[] args) {
        //append
        StringBuffer sb= new StringBuffer("Prashant ");
        sb.append("Yadav ");
        System.out.println(sb);
        //insert()
        sb.insert(1,123);
        System.out.println(sb);

        //replace
        sb.replace(6,11,"hello");//start inclusive and end is exclusive
        System.out.println(sb);
        //reverse()
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb1= new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2= new StringBuffer("1");
        System.out.println(sb2.capacity());

    }
}

package string;

public class stringandstringbuffer {
    public static void main(String[] args) {
        String s1="hello";
        String s2=s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        StringBuffer sb= new StringBuffer("Ratan ");
        StringBuffer sb1= sb.append("Yadav");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb==sb1);

    }
}

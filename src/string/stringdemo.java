package string;

public class stringdemo {
    public static void main(String[] args) {
        String s2= new String("bay");
        String s= new String ("hello");
        String s1= "hey";
        System.out.println(s1==s);
        String s3="hey";
        System.out.println(s1==s3);
        //==  treated as reference comparison means at which location(ie; to which object they both referencing or pointing
        //.(equals) treated as content comparison
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s));
        System.out.println(s2.equals(s1));
    }
}

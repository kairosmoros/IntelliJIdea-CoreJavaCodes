package string;

public class compareTo {
    public static void main(String[] args) {
        String s1= "helloaa";
        String s2="hello";
        String s3="hello";
        String s4="yello";
        int res1= s1.compareTo(s2);
        int res2= s2.compareTo(s1);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(s3.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s3.equals(s4));
    }
}

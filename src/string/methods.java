package string;

public class methods
{
    public static void main(String[] args)
    {
        String s= new String("Prashant Yadav");
        System.out.println(s.length());
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));

        }
        System.out.println();
        String s1="Prashant";
        String s2="Yadav";
        s1=s1+s2;
        System.out.println(s1);
        String s11="Ratan Singhania";
        System.out.println(s11.charAt(3));
        String s12="hello";
        String s13="hello";
        String s14="hey";
        int res1=s12.compareTo(s14);
        System.out.println(res1);
        int res=s12.compareTo(s13);
        System.out.println(res);
        String s15="Prashant Yadav";
        System.out.println(s15.contains("Prashant"));
        System.out.println(s15.contains("Y"));
        System.out.println(s15.indexOf('a'));
        System.out.println(s15.lastIndexOf('a'));
        char ch[]={'a', 'b', 'c'};
        String s7=new String(ch);
        System.out.println(s7);

    }

}

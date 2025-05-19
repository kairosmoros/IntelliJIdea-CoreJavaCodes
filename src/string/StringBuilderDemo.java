package string;
/*
    String Builder and String Buffer  both are same ie; used for creating mutable Strings , the only difference is String
    builder is not Thread safe and doesn't guarantee synchronisation while String Buffer Provides Both.
    So;
    NOTE: 1. When we want a mutable String without thread-safety then StringBuilder should be used.
          2. When we want a mutable String with Thread safety then String Buffer should be used.
          3. When we want an immutable object then String should be used.
 */
public class StringBuilderDemo
{
    public static void main(String[] args)
    {
        StringBuilder s1= new StringBuilder("Prashant ");
        StringBuilder s2= s1.append("Yadav ");
        System.out.println(s1);
        System.out.println(s2);

    }
}

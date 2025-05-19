package StaticAndDefaultMethodInterfaceJDK7;
/*
1. Interface variables are by default public static final.
2. We must initialize variables defined in interface.
3. We can't modify variables as they are final.
 */
interface code
{
    int a=10;//default it is public , static and final, no need ot write it.
}
public class Demo2
{
    public static void main(String[] args) {
        System.out.println("a value: " +code.a);
       // code.a=30;//erro: final variable can't be modified.
    }
}

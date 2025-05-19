package LambdaExpression;
interface Adder
{
    int add(int a, int b);
}
public class LmbdaExpressionBlockForm
{
    public static void main(String[] args) {
        Adder sum=(a,b) ->{
            int result =a+b;
            System.out.println("Adding numbers.....");
            return result;//it will return result to println ie; line number 14, and it will print the result.
        };
        System.out.println(sum.add(5,4));

    }
}

package LambdaExpression;
/*
 1. Expression immediately return a value, and they can't contain variables , assignments or statements
 such as if or for.
 2. In order to do more complex operations, a code block can be used with curly braces.
 3. If the lambda expression needs to return a value then the code block should have a return statement.
 */
@FunctionalInterface
interface Calc
{
    void add(int x, int y);
}
public class LambdaExpressionwithArguments
{
    public static void main(String[] args) {
        Calc obj=(x,y) -> System.out.println("sum : " +(x+y));//lambda Expression

        obj.add(10,20);
        obj.add(4,2);
    }
}

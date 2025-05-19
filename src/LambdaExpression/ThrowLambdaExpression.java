package LambdaExpression;
//Expression is a line of code.
// Lambda expression is the implementation of Functional Interface in  short format.
//So lambda expression let us write short implementations of interfaces that have only one abstract method (called -
//Functional Interfaces).
@FunctionalInterface
interface Test2
{
    void fun();
}
public class ThrowLambdaExpression {
    public static void main(String[] args) {
        Test obj=() -> System.out.println("Lambda function ");// Expression immediately return a value, and they can't contain variables , assignments or statements  such as if or for.
               //() is used since no parameters in FunctionalInterface
        obj.fun();
    }
}
/*
 () -> expression [if the method not taking any parameter]
 parameter -> expression [if the method taking only one parameter]
 (parameter1, parameter2) -> expression [if the method taking more than one parameter
 */

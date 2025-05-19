package LambdaExpression;
/*
    Lambda expression automatically returns the value which is evaluated in expression. We need to specify the return
    type in Functional interface specification.
 */
@FunctionalInterface
interface Calc1
{
    int add(int x, int y);
}
public class LambdaExpressionwithReturnvalues
{
    public static void main(String[] args) {
        Calc1 obj= (a,b) -> (a+b);//here (a+b) will automatically get returned to interface Calc1 and Calc1 will return back to sout from where it was called.
      /*
              /*
            FLOW CONTROL:
            main() calls obj.add(2, 3)
                   ↓
            Lambda executes (2 + 3)
                   ↓
            Returns 5 to obj.add(...)
                   ↓
           obj.add(...) returns 5 to println
                   ↓
           println prints "sum : 5

       */

        System.out.println("sum : " +obj.add(2,3));
        System.out.println("sum : " +obj.add(30,30));
    }
}

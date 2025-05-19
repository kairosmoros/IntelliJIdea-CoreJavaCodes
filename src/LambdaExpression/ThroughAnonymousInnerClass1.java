package LambdaExpression;
// Anonymous class outside a method.
interface Test1{
    void fun();
}
class main
{//Anonymous class instance variable (outside method)
    Test1 obj = new Test1()//obj is reference instance variable.
    {
        public void fun() {
            System.out.println("from instance variable");
        }
    };
}
public class ThroughAnonymousInnerClass1
{
    public static void main(String[] args) {
        main m=new main();
        m.obj.fun();//note that you can't use only m.fun() to access sine it gives error because the class main doesn't
        //direct fun() method. So m.obj.fun(); is used , where obj holds the power to get the fun() method which is the function of
        //interface Test1 overridden by class main.
    }

}

package InstanceAndLocalVariable;
class SimpleClass4
{
    int instanceVar;

    void showVariables()
    {
        instanceVar=30;
        int localVar=5;
        localVar=localVar +3;//Modify local variable
        System.out.println("Inside method - instanceVar: " +instanceVar);
        System.out.println("Inside method - localVar " +localVar);
    }
    void showVariables1()
    {
        System.out.println("note that inside another method too the instance value changed even though it was changed by other method which is now instance value is " +instanceVar);
    }
}
public class instanceandlocaldemo4
{
    public static void main(String[] args)
    {
        SimpleClass4 obj = new SimpleClass4();
        obj.showVariables();//First call
        obj.showVariables1();//second call
    }
}

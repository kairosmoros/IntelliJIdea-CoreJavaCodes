package InstanceAndLocalVariable;
class SimpleClass3
{
    int instanceVar;
    SimpleClass3(int intialValue)
    {
        instanceVar =intialValue;
        System.out.println("Constructor - instanceVar: " +instanceVar);
    }
    void showVariables()
    {
        int localVar=5;
        localVar=localVar +3;//Modify local variable
        System.out.println("Inside method - instanceVar: " +instanceVar);
        System.out.println("Inside method - localVar " +localVar);
    }
    void modifyInstanceVar(int newValue)
    {
        instanceVar= newValue;
    }
}
public class instanceandlocaldemo3
{
    public static void main(String[] args)
    {
        SimpleClass3 obj = new SimpleClass3(10);
        obj.showVariables();//First call
        obj.showVariables();//second call
    }
}

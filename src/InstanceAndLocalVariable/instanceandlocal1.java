package InstanceAndLocalVariable;
class SimpleClass1
{
    //Instance variable (belongs to the object)
    int instanceVar=10;
    //Method with a local variable
    void showVariables()
    {
        int localVar=5;//Local variable (belongs to the method)
        System.out.println("Inside method -  instanceVar: "+instanceVar);
        System.out.println("Inside method - localVar: " +localVar);
    }
    //Another method to modify instance variable
    void modifyInstanceVar()
    {
        instanceVar =20;
    }
}
public class instanceandlocal1
{
    public static void main(String[] args)
    {
        SimpleClass1 obj1=new SimpleClass1();//First object
        SimpleClass1 obj2=new SimpleClass1();//Second object
        obj1.showVariables();//obj1's values values
        obj1.modifyInstanceVar();
        obj1.showVariables();//obj1's values after modfication
        obj2.showVariables();//obj2's values (unaffected by obj1
    }
}

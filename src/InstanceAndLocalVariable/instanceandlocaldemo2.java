package InstanceAndLocalVariable;
class SimpleClass2
{
    int instanceVar;
    //Constructor to initialize instance variable
    SimpleClass2(int initialVlaue)
    {
        instanceVar= initialVlaue;
        System.out.println("Constructor - instanceVar: " +instanceVar);
    }
    void showVariables()
    {
        int localVar=5;
        System.out.println("Inside method - instanceVar: " +instanceVar);
        System.out.println("Inside method - localVar: " +localVar);
    }
    void modifyInstanceVar(int newValue)
    {
        instanceVar = newValue;
    }
}
public class instanceandlocaldemo2
{
    public static void main(String[] args)
    {
        SimpleClass2 obj1= new SimpleClass2(10);//Initialize with 10
        obj1.showVariables();
        obj1.modifyInstanceVar(30);
        obj1.showVariables();
        SimpleClass2 obj2 = new SimpleClass2(20);//Initialize with 20
        obj2.showVariables();
    }
}

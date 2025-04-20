package InstanceAndLocalVariable;
/*Local Variables:
1.Definition: Local variables are declared within a method, constructor, or block. They are specific to the scope in which they are defined.
Behavior:
Initialized each time the method, constructor, or block is entered (if not explicitly initialized, they must be assigned
a value before use, or you’ll get a compilation error).
Do not retain their value between method calls. Each call creates a new instance of the local variable, and it’s
reinitialized (or uninitialized if not set).
Their scope ends when the method or block exits, so they don’t persist across executions.
2.Definition: Instance variables are declared within a class but outside any method, constructor, or block. They belong
to an object instance (e.g., private int count = 0 in the counter class).
Behavior:
Initialized when a new object is created (e.g., new counter() sets count to 0).
Remain the same throughout the object’s lifetime unless explicitly reassigned or modified (e.g., count++ or count = 0).
Do not reinitialize automatically when methods are called or threads execute. Their value persists across method calls
and thread executions as long as the same object instance is used.
If a new object is created, a new instance variable is initialized (e.g., new counter() creates a new count starting at 0),
but the original object’s count remains unchanged.
 */
class SimpleClass
{
    //Instance variable (belongs to the object)
    int instanceVar=10;
    //Method with a local variable
    void showVariables()
    {
        int localVar =5;//Loacl variable (belongs to the method)
        System.out.println("Inside method - instanceVar: " +instanceVar);
        System.out.println("Inside method - localVar: " +localVar);
    }
    //Another method to modify instance variable
    void modifyInstanceVar()
    {
        instanceVar=20;
    }
}
public class instaceandlocaldemo
{
    public static void main(String[] args)
    {
        SimpleClass obj= new SimpleClass();//creates a new object
        obj.showVariables();//call method to display initial values
        obj.modifyInstanceVar();//modify instance variable
        obj.showVariables();//call method again to see persistence
    }
}

package InstanceAndLocalVariable;
interface test
{
    void fun();
}
class main
{
    test obj= new test()//here obj is the reference instance variable because it is defined inside the class but outside of
        //any method , block or contructor.
    {
       public void fun()
        {
            System.out.println("function method in implemented in class main ");
        }
    };
}
public class ReferenceInstanceVariable {
    public static void main(String[] args) {
        main m= new main();
        m.obj.fun();
    }
}

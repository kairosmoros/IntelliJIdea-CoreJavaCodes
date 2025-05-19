package LambdaExpression;
/*
 Through Anonymous inner class: An anonymous inner class is class without a name,  defined and instantiated in a single
 expression . It is commonly defined inside a method but it can also be used in instance initializers , constructors or
 static blocks.
 */
interface Test
{
    void fun();
}
public class ThroughAnonymousInnerClass {
    public static void main(String[] args) //this is the method inside which class is defined
    {
        Test obj=new Test()//Anonymous class starts here and it can't be instantiated since for an interface we can't make objects.
        {
            //This is the body of class - The Anonymous class
            public void fun()
            {
                System.out.println("Anonymous function ");
            }
        };//here the object got created.
        obj.fun();//here we are calling the method
    }
}
/*


 */
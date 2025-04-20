package variabletypedemo;
class demo
{
    String name="Ratan";//instance variable ( it gets it memory in runtime) also its by default value is 0 that is if a; like it is only declared then  default it gets assigned to value 0;s
    void m1()
    {
        String name1="Prashant";//local variable( when taking a local variable one should intialize and declare at same time like a=10; no default value as of instance variable
        System.out.println("local variable can be accessed only inside the method in which it is declared as "+(name1));
        System.out.println("the instance name can be accessed anywhere inside the class as "+(name));
    }
    void display()
    {
        //System.out.println("here the local variable can't be accessed since we are calling it out of its method as "+(name1));
        System.out.println("here the instance variable can be accessed since we are calling it still inside its class itself as "+(name));

    }
    void show(String n1, int a)
    {
        System.out.println(n1);
        System.out.println(a);
        System.out.println("name is "+(this.name));
    }
}
public class variabledemo {
    public static void main(String[] args) {
        demo d=new demo();
        d.m1();
        d.display();
        d.show("niharika",20);

    }
}

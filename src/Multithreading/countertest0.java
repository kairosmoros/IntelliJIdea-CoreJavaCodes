package Multithreading;
class counter6
{
    int value=0;
    void increment()
    {
        value++;
    }
}
class counter1
{
    counter6 t = new counter6();//creating a counter object
    void showCount()
    {
        t.increment();
        System.out.println("count is: " +t.value);
    }
}
public class countertest0
{
    public static void main(String[] args)
    {
        counter1 c1= new counter1();
        c1.showCount();

    }
}



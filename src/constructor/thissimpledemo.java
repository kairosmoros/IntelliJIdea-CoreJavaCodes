package constructor;
class Doggy
{
    String name;//set here julie
}
class cat extends Doggy
{
    String name;//set here pussy
    void print()
    {
        this.name="pussy";// this is used to access current object and also if you'll not write this then also it will by default take the current object only
        super.name="Julie";
        System.out.println("parent class animal name is "+(super.name));
        System.out.println("child class animal name is "+(this.name));
    }
}
public class thissimpledemo
{
    public static void main(String[] args) {
        cat c=new cat();
        c.print();

    }
}

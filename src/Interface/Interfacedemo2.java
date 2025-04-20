package Interface;

public class Interfacedemo2 {
    public static void main(String[] args) {
        Animal1 d1= new dog1();
        Animal1 c1= new cat();
        d1.sound();
        c1.sound();
    }
}
interface Animal1
{
    void sound();
}
class cat implements Animal1
{
    @Override
    public void sound() {
        System.out.println("meow!");
    }
}
class dog1 implements Animal1
{
    @Override
    public void sound() {
        System.out.println("OOhuuuuuuu");
    }
}
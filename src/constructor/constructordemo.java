package constructor;
class Animal
{
    public void m1()
    {
        System.out.println("m1");
    }
    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    Animal()//ab yha prr mera khud ka constructor hai jo ki agar comment krr dunga toh bhi jvm apna chala rha tha by default now abb mai bna diya toh dikh rha ki chal rha hai
            //also constructor name will be same as class name in which it is defined
    {
        System.out.println("constructor chal rha hai");
    }
    // if i am making my own constructor then i need to call with that parameters itself else it will throw error like if I create Animal(int a, int b) then i can call as Animal(3,5) and not just Animal(string) since i have not created such type of constructor
}

public class constructordemo
{
    public static void main(String[] args) {
        Animal a=new Animal();// ye jo animal() hai ye constructor hai aur jvm by default chala rha hai constructor ko lekin hmko nhi dikh rha hai
        a.m1();
        a.sum(2,4);
    }
}

package DIdependencyinjection;
/* Constructor Injection

 */
//Step 1: Define the Interface
interface InkCartidge
{
    void supplyInk();
}
//Step 2: Create Implementations
class HPInk implements InkCartidge
{
    public void supplyInk()
{
    System.out.println("Sypplying HP Ink...");
}
}
class CanonInk implements InkCartidge
{
    public void supplyInk()
{
    System.out.println("Supplying Canon Ink...");
}
}
// Step 3: Printer Class Depends on InkCartridge
class Printer
{
    private InkCartidge cartidge;
    //Constructor Injection
    public Printer(InkCartidge cartidge)
    {
        this.cartidge=cartidge;
    }
    public void printDocument()
    {
        cartidge.supplyInk();
        System.out.println("Printing document...");
    }
}
//
public class dependencyinjecton2 {
    public static void main(String[] args) {
        InkCartidge ink= new HPInk();//Dependency created(You decide the brand)
        Printer print=new Printer(ink);
        print.printDocument();
    }
}

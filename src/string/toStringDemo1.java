package string;
class ExampleClass
{
    private String panNumber;
    private String aadhaarNumber;
    private String bankDetails;
    private String investments;
    //Constructor
    public ExampleClass(String panNumber, String aadhaarNumber, String bankDetails, String investments )
    {
        this.panNumber= panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bankDetails = bankDetails;
        this.investments = investments;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investments='" + investments + '\'' +
                '}';


    }


}
public class toStringDemo1
{
    public static void main(String[] args) {
        ExampleClass obj= new ExampleClass("ABC1234" , "XYZ5678" , "Saving: 1000", "Stocks: 1000");
        System.out.println(obj);// Calls toString() automatically
    /* Reference or Object?:
It's the object that toString() is called on, but the reference (obj) is what you use to access that object.
In this case, sout(obj) triggers obj.toString(), and because obj is a reference to an ExampleClass object, the overridden toString() in ExampleClass is executed.*/
    }
}

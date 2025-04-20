package Project1UsingCoreJava;

public class Aadhaar
{

        private String aadhaarNumber;
        private String name;
        private String fatherName;
        private String address;

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Aadhaar(String aadhaarNumber, String name, String fatherName, String address) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
    }

    @Override
    public String toString()
    /* Why toString() is used here:
When you do something like:Aadhaar a = new Aadhaar("123456789012", "Prashant", "Mr. Yadav", "Gorakhpur");
System.out.println(a);
Without toString(), this will print something like: Project1UsingCoreJava.Aadhaar@3f99bd52
That's the default implementation from Object class, which is not helpful.
But since you've overridden the toString() method, it will print: Aadhaar{aadhaarNumber='123456789012', name='Prashant', fatherName='Mr. Yadav', address='Gorakhpur'}
In simple terms:
It gives your object a human-readable format when printing or logging. It’s like customizing how you want your Aadhaar object to introduce itself
     */
    {
        return "Aadhaar{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

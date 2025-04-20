package oops;
class TestAbs
{
    public void printEngineDetails(vehicle v1)
    {
        v1.engine();
    }
}
public class abstractiontest
{
    public static void main(String[] args) {
      TestAbs t= new TestAbs();
      t.printEngineDetails(new Mahindra());
      t.printEngineDetails(new BMW());
    }
}

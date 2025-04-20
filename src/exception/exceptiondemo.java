package exception;

public class exceptiondemo
{
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0; i<arr.length ; i++)
        {
            arr[i]=i;
        }
        try
        {
            int res= arr[1];
            // int res= arr[9];
            throw new ArithmeticException("Request denied/failed due to technical error ");//here this line not execute at all if i write arr[9] and will directly go to the catch part of
            //ArrayIndexOutOfBoundException e and jvm will give it message since I have not given it
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound exception since I am in array error");
            System.out.println(e.getMessage());
        }

        catch(Exception e)
        {
            System.out.println("I am in catch");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        /* If you put catch(Exception e) first, then specific ones like ArithmeticException or ArrayIndexOutOfBoundsException will never be reached.
        That’s why Java requires more specific exceptions first, then the general Exception type at the end.  */
    }
}

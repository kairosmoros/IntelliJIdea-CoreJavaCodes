package exception;

public class finallydemo
{
    public static void main(String[] args) {
        try//try can be used with catch or finally or both but not alone
        {
            System.out.println(10/0);
        }
         catch (Exception e)
        {
            System.out.println("I am in catch");
           System.out.println(e.getMessage());
        }
        finally//it will be executed no matter what ie either error is thrown or not it will
                //run definetly
            {
                System.out.println("The best student is ");
                System.out.println("Ratan");
            }
        }
    }


package Modifiers;
class privatemodifier1
{
    private static String name ="Prashant";//private
    private void display()
    {
        System.out.println("Hello "+name);
    }


        public static void main(String[] args)
        {
            privatemodifier1 p= new privatemodifier1();
            p.display();
            System.out.println(name);
        }



}




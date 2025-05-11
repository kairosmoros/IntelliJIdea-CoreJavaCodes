package string;
/* 1.what is a command line argument?
* In java( and other languages too), command line arguments are inputs you give to your program when you run it from the terminal.
*Instead of writing code like this: Scanner sc=new Scanner(System.in); int a =sc.nextInt();
* You run the program like this: java MyPragram 5 10
* here, 5 and 10 are command-line argumetns. They are passed into the main(String[] args) method.
* 2.Why do we need it?
* We use command-line arguments when we want to : Give inputs at runtime without writing input code.
* Automate testing with different inputs(like in scripts or production environments).
* Build lightweight tools or scripts that don't rely on GUIs or input prompts.
*3.What happens int the code?
* public static void main(String[] args)
* The args variable is a String array.
* Whatever you write after the class name in the terminal gets stored in that args array.
* Example: java MyProgram 20 30
* args[0]="20" ----> String
* args[1]="30" ----> String
* You need to convert these Strings into integers to do addition .
* That's why we write:
* int number1=Integer.parseInt(args[0]); Note that this is not typecasting instead it is type-conversion .
* Typecasting is done like (int) someFloatNumber----> This is done between compatible primitve types.
*  */
public class javaprogramwithcmdlinearguments
{
    public static void main(String[] args) {
        //convert into integer type
        int number1 = Integer.parseInt(args[0]);
        System.out.println("First number is : " + number1);
        //convert into integer type
        int number2= Integer.parseInt(args[1]);
        System.out.println("second number : " +number2);
        int result=number2+number1;
        System.out.println("addition of two numbers is : " +result);

    }
}
/*
javac src/string/javaprogramwithcmdlinearguments.java  //This will create the .class file inside src/string.

java -cp src string.javaprogramwithcmdlinearguments 10 20  //-cp src means: use src as the root directory for class files.string.javaprogramwithcmdlinearguments = package + class name 10 20 = command line arguments





 */

package oops.EncapsulationAndAbstractionDifference;
//Abstraction: Interface defines essential behavior (WHAT, NOT HOW)
interface Shape
{
    double calculateArea();
}
// Encapsulation: Rectangle hides data and controls access
class Rectangle implements Shape
{
    //Private fields (encapsulation: data hiding)
    private double width;
    private double height;
    //Constructor
    public  Rectangle(double width, double height)
    {
        if(width> 0 && height>0)
        {
            this.width=width;
            this.height= height;
        }
        else {
            throw new IllegalArgumentException("Width and height must be positive ");
        }
    }

    // Public getter (controlled access)
        public double getWidth()
        {
            return width;
        }
        //Public getter (controlled access)
        public double getHeight()
        {
            return height;
        }
        //Public setter with validation
        public void setWidth(double width)
        {
            if(width>0)
            {
                this.width=width;
            }
            else {
                throw new IllegalArgumentException("Width must be positive");
            }
        }
        //Implement abstract method(abstraction)
            @Override
                    public double calculateArea()
        {
            return width * height;//Internal logic hidden
        }

    }

public class EncapsulationVsAbstraction
{
    public static void main(String[] args)
    {
        //Use abstraction: Interact with Shape interface
        Shape rectangle = new Rectangle(4.5,1.5);
        //Abstraction: Call method without knowing implementation
        System.out.println("Area: "+rectangle.calculateArea());
        //Encapsulation: Access data via controlled methods
        //when you use an interface type to refer to an object, you can only call methods that are declared in that interface.
       // System.out.println("Width: "+ rectangle.getWidth());//getWidth() is not in shape
        //rectangle.setWidth(10.0);//setWidth is not in shape
        Rectangle rect= new Rectangle(4.5,1.5);
        System.out.println("Width: " +rect.getWidth());
        rect.setWidth(10.5);
        //here you can set width since setWidth() public method  is there but you can't set height since no where code written that too public
        System.out.println("New Area: "+rect.calculateArea());
        //cannot access width directly (e.g., rect.width =-5 is not allowed)

    }
}

package JavaCollections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuDrivenProgram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Double> map= new HashMap<String,Double>();
        while(true)
        {
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Display Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Display all books in the Map");
            System.out.println("6. To find the size of the map or number of key-value pair: ");
            System.out.println("7. To return the the value of specific book(key)");
            System.out.println("8. To get the all values of the map");
            System.out.println("9. To remove the all the  key-value pair Means Removes all elements");
            System.out.println("10. Quit");
            System.out.println("Enter Your choice : ");
            int ch=sc.nextInt();
            sc.nextLine();
            if(ch==1)
            {
                System.out.println("Enter Book Name: ");
                String name=sc.nextLine();
                if(map.containsKey(name))//returns true if this map contains key-value
                {
                    System.out.println("Book Already Exists ");
                }
                else {
                    System.out.println("Enter Price : ");
                    double price=sc.nextDouble();
                    map.put(name,price);//store value using key I mean for that key value assigned ie Map<key,value>
                    System.out.println("Book added successfully ");
                }

            }
            else
            if(ch==2)
            {
                System.out.println("Enter the book name you want to update : ");
                String name=sc.nextLine();
                if(map.containsKey(name))
                {
                    System.out.println("Enter Price : ");
                    double price=sc.nextDouble();
                    map.replace(name,price);//Replace the value of specified key with given values here name is key and value is price
                    System.out.println("Book updated");

                }
                else System.out.println("Error : Invalid Book Name");

            }
            else if(ch==3)
            {
                System.out.println("Enter book name to be displayed: ");
                String name= sc.nextLine();
                if(map.containsKey(name))
                {
                    System.out.println("Price: " +map.get(name) + "and book name is which you entered : " +name);
                }
                else System.out.println("Error : Invalid Book Name ");
            }
            else if(ch==4)
            {
                System.out.println("Enter book name to be removed: ");
                String name=sc.nextLine();
                if(map.containsKey(name))
                {
                    map.remove(name);//this removes key-value of specified key.
                    System.out.println("Your book namely : "+ name + " is removed successfully ");
                }
                else System.out.println("Invalid book name ");
            }
            else if(ch==5)
            {

                System.out.println("total books in Map set is : "+map);

            }
            else if(ch==6)
            {
                System.out.println("The size of the key-value in map or size of map is : " +map.size());
            }
            else if(ch==7)
            {
                System.out.println("enter the book name whose value(price in this program) you want to see");
                String name=sc.nextLine();
                if(map.containsKey(name))
                {
                    System.out.println("value of the book named " +name + " is: "+map.get(name));
                }
                else
                    System.out.println("Invalid Book name : ");
            }
            else if(ch==8)
            {
                Collection<Double> values=map.values();
//Collection<Double(here is the datatype of value)> values=map.values()//
                System.out.println("All values of this map are: " +values);
            }
            else if(ch==9)
            {
                map.clear();
                System.out.println("after removing all the elements the map size is : " +map.size());
            }
            else if(ch==10)
            {
                System.exit(1);
            }
        }
    }
}

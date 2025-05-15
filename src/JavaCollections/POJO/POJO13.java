package JavaCollections.POJO;
/* Menu Driven ArrayList
    The program displays options to the user like (add, remove, display, search etc.) , takes input and performs actions based on the selection.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class POJO13
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Append");
            System.out.println("2.Insert");
            System.out.println("3.Replace");
            System.out.println("4.Remove");
            System.out.println("5.Display Particular Element");
            System.out.println("6.Display");
            System.out.println("7.Sort");
            System.out.println("8.Reverse");
            System.out.println("9.Quit");
            System.out.println("Enter choice: ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter element to append: ");
                int ele=sc.nextInt();
                list.add(ele);
                System.out.println("element appended as : "+list);
            }
            else
            if(ch==2)
            {
                System.out.println("enter index : ");
                int index=sc.nextInt();
                sc.nextLine();
                if(index>=0 && index<=list.size())
                {
                    System.out.println("enter element: ");
                    int ele=sc.nextInt();
                    list.add(index,ele);
                    System.out.println("Element inserted as : "+list);

                }
                else System.out.println("either index is less that list size or greater than it");

            }
            else
            if(ch==3)
            {
                System.out.println("insert element to replace ");
                int ele=sc.nextInt();
                if(list.contains(ele))
                {
                    int index=list.indexOf(ele);
                    System.out.println("Enter new element :");
                    int x=sc.nextInt();
                    list.set(index,x);
                    System.out.println("element replaced as: " +list);
                }
                else System.out.println("no such element in list");
            }
            else
            if(ch==4)
            {
                System.out.println("insert element to remove");
                int ele=sc.nextInt();
                if(list.contains(ele))
                {
                    int index=list.indexOf(ele);
                    list.remove(index);
                    System.out.println("element removed as: "+list);
                }
                else System.out.println("no such element to remove");

            }
            else
            if(ch==5)
            {
                System.out.println("enter element to display ");
                int ele=sc.nextInt();
                if(list.contains(ele))
                {
                    int index=list.indexOf(ele);
                    System.out.println("element is " +list.get(index));

                }
                else System.out.println("element is not found in the list");
            }
            else
                if(ch==6)
                {
                    if(!list.isEmpty())
                    {
                        System.out.println("list is : " +list);
                    }
                    else System.out.println("list is empty ");
                }
            else
                if(ch==7)
                {
                    Collections.sort(list);
                    //Collections.sort() is a method in Java used to sort elements of a List in ascending order by default.
                    System.out.println("list sorted as : "+list);
                }
                else if(ch==8)
                {
                    Collections.reverse(list);
                    System.out.println("List is reversed as : "+list);
                }
                else if(ch==9)
                {
                    System.out.println("end");
                    System.exit(1);
                }
                else
                    System.out.println("Invalid choice");
        }
    }
}
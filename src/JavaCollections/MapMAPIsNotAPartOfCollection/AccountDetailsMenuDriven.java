package JavaCollections.MapMAPIsNotAPartOfCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account
{
    private int number;
    private String name;
    private double balance;
    private String location;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", location='" + location + '\'' +
                '}';
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
public class AccountDetailsMenuDriven
{
    public static void main(String[] args) {
        Map<Integer, Account> map = new HashMap<Integer, Account>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add Account");
            System.out.println("2. Update Data");
            System.out.println("3. Display Account");
            System.out.println("4. Remove Account");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter Account Number: ");
                Integer number = sc.nextInt();//here is your account number it is the key of yours
                sc.nextLine();
                if (map.containsKey(number)) {
                    System.out.println("Account Already exists: ");
                } else {
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Location: ");
                    String location = sc.nextLine();
                    System.out.println("Enter Balance: ");
                    double blnc = sc.nextDouble();

                    Account acc1 = new Account();//creation of account object
//Variable names (like acc1) are just references. As long as you use new, you're always creating new objects — even
// if the reference name is the same.
                    acc1.setBalance(blnc);
                    acc1.setNumber(number);
                    acc1.setName(name);
                    acc1.setLocation(location);
                    map.put(number, acc1);//here this will set in map number(ie; Account Number as key which you
                    // declared before if statement itself and acc1 means all the instance of this acc1 object of class Account will get stored in the Map;
                    //System.out.println("Map contents are :" +map);
                    System.out.println("your data in Map contents are  : " + number + "(key) = " + acc1.getNumber() + " , " + acc1.getName() + " , " + acc1.getLocation() + " , " + acc1.getBalance());

                }
            }
            else if (choice == 2)
            {
                System.out.println("Enter Account number to update the data : ");
                Integer number = sc.nextInt();
                sc.nextLine();
                if (map.containsKey(number))
                {

                    System.out.println("note that you can't update your balance and account number: ");
                    System.out.println("Press 1 to update Name and 2 to update Location:");
                    int num = sc.nextInt();
                    sc.nextLine();
                    switch (num) {
                        case 1:
                            System.out.println("Enter the name to update: ");
                            String name = sc.nextLine();
                            Account acc1 = map.get(number);//map.get(number) returns the values for this number(key) ie:map.get(key);
                            acc1.setName(name);//here then in that values which we got, now we are updating the name for that particular reference object
                            System.out.println("Name got Updated: ");
                            System.out.println("Yours Update data in map is : " + acc1.getName() + " , " + acc1.getNumber() + " , " + acc1.getLocation() + " , " + acc1.getBalance());
                            break;
                        case 2:

                            System.out.println("Enter the location to update: ");
                            String location = sc.nextLine();
                            Account acc2 = map.get(number);
                            acc2.setLocation(location);
                            System.out.println("Locaton updated :");
                            System.out.println("your new data in map  is : " + acc2.getLocation() + " , " + acc2.getNumber() + " , " + acc2.getName() + " , " + acc2.getBalance());


                    }
                }


            }
            else if(choice==3)
            {

                System.out.println("The whole map data is: "+map);
            }
            else if(choice==4)
            {
                System.out.println("Enter account number to remove: ");
                 Integer number=sc.nextInt();
                if(map.containsKey(number))
                {
                    map.remove(number);
                    System.out.println("Your account successfully removed: your account is : "+map);
                }
                else System.out.println("Invalid credentials Enter correct account number ");
            }
            else if(choice==5)
            {
                System.exit(1);
            }
        }
    }
}
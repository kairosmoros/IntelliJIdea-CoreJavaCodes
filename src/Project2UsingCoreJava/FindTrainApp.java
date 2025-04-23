package Project2UsingCoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTrainApp
{
    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();
        //adding new stations
        Station station1= new Station("ST01" , "Telangana");
        Station station2= new Station("ST02" , "Lucknow");
        // adding new trains
        Train train1 = new Train("12309" , "Yashwantpur Express" , "Express");
        Train train2 = new Train("12304" , "Intercity" , "Passenger");
        //adding platform number
        Platform p1= new Platform(1);
        Platform p2= new Platform(2);
        p1.setTrain(train1);
        p2.setTrain(train2);
        List<Platform> platformlist= new ArrayList<>();
        platformlist.add(p1);//this adds 1  to the list of Platform class
        platformlist.add(p2);//this adds 2 to the list of Platform class
        //keep in mind that the platformlist's list conatains trains too , since p1 and p2 are reference to object of class Platform and the instances of object in Platform class is 2 ie; train and platformNumber
      //  System.out.println(platformlist);
        station1.setPlatformlist(platformlist);//at station1, two platforms are there ( which is stored in the list)
        //You can also add for station2 if you wish to
        Schedule s1= new Schedule(train1, station1,"10:00 PM" , "10:05 PM", p1);//means the train 1 is coming on platform 1 we should give it because station1 is already having two platforms
        Schedule s2= new Schedule(train2, station1 , "11:45 AM", "11:50 AM", p2 );
        system.addStations(station1);//calls class TrainSystem
        system.addStations(station2);//calls class TrainSystem
        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);
        //let's find train between stations
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the source: ");
        String source= sc.nextLine();
        System.out.println("Enter the destination: ");
        String destination= sc.nextLine();
       List<Schedule> myTrains = system.findMyTrains(source,destination);
       /*
So Why Do We Sometimes Write new ArrayList<>()?
Great question!

Because sometimes you don’t have any method giving you a list, and you want to create one from scratch.

For example:

java
Copy
Edit
List<String> names = new ArrayList<>();
names.add("Prashant");
names.add("Ravi");
But when some method is already returning a list, you don’t have to make a new one.






       If you are making tea yourself → You bring an empty cup (new ArrayList<>();) and add ingredients (add()).

If someone already gives you tea → You just hold the cup (List<Schedule> myTrains = system.findMyTrains(...)) — no need to make a new cup!


List<Schedule> myTrains = system.findMyTrains(source, destination);
Means:

myTrains is now referring to a list returned by the method.

The list is already created inside the method.

You’re reusing that list — no need to create another one with new ArrayList<>().



*/
        System.out.println("Your Trains Between " +source+ " and " +destination);//HERE HOW MANY TRAINS ARE RUNNING BETWEEN AGRA AND LUCKNOW
        for(Schedule schedule:myTrains)//to understand this see line 43
        {
            System.out.println(schedule);
        }


    }
}

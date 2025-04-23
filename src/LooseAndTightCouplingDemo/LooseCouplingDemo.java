package LooseAndTightCouplingDemo;

import java.util.ArrayList;
import java.util.List;

class Platform
{
    int number;
    String status;
    //each Platform object is independent and holds its own number and status — and only the targeted one gets updated.”
    Platform(int number)
    {
        this.number=number;
        this.status="Available";
    }
    void assignTrain(String trainName)
    {
        status="Occupied by " +trainName;
    }
    void showStatus()
    {
        System.out.println("Platform " +number+ "is " +status);
    }
}
class Station
{
    List<Platform> platforms;//WHEN we make list in any class then that list will be always there in that class only and only if we give permission for other classes like Platforms etc then they will be able to access it can be done by making the class
    //in which the list made as public and other class referencing to the class Station
Station(int numberOfPlatforms)
        {
            platforms= new ArrayList<>();

            for(int i=1; i<=numberOfPlatforms; i++)
            {
                platforms.add(new Platform(i));//Here you are not adding primitive type(integer etc) rather you are adding object of type Platform therefore new each time required
                //new Platform(i) means: "Create a new Platform object and give it a number like 1, 2, 3 etc. and then .add(...) adds that object to the list.
            }
        }
        void showAllStatuses()
        {
            for(Platform p: platforms)
            {
                p.showStatus();
            }
        }
}
class Train
        {
            String name;
            Train(String name)
            {
                this.name=name;
            }
            void arrive(Station station, int platformNumber)
            {
                station.platforms.get(platformNumber -1).assignTrain(name);
            }
        }

public class LooseCouplingDemo
{
    public static void main(String[] args) {
        Station s= new Station(4);
        Train t= new Train("Tamilla Express");
        t.arrive(s,2);//Train arrives at Platform 2
        s.showAllStatuses();
    }
}
/* TRICK TO BUILD A DESIGN BEFORE CODING :
✅ 1. Think in terms of responsibility (Who “owns” what?)
Ask:

Who logically owns or manages the thing?

In your case:

Does each platform manage a list of other platforms? ❌ That makes no sense.

Does a station manage multiple platforms? ✅ Yes. That’s its job.
Put the list where the group naturally belongs

✅ 2. Every class should be responsible for itself — and nothing more.
A Platform should know about:

its number

its status

A Station should know about:

the list of Platforms

assigning trains to platforms
DON’T give a class responsibilities it shouldn't own.

🚀 Pro-Tip: How to Start Writing These Kinds of Codes
When you face any such problem, follow this golden sequence:

💡 Think: “Nouns → Classes, Verbs → Methods”
Let’s take your Station/Train example:

1. List all nouns
Train → class

Platform → class

Station → class

Status → a field inside Platform
2. List the relationships
A Station has many Platforms ✅

A Train arrives at a Platform ✅

3. List all actions
Train arrives → method in Train or Station

Show status → method in Platform
Then you structure accordingly.

If it’s a list of Books, and a Library owns them → List goes in Library

If it’s a list of Songs, and a Playlist owns them → List goes in Playlist


 */
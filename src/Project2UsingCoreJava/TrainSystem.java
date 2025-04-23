package Project2UsingCoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem
{
    private Map<String,Station> stations =new HashMap<>();
    private Map<String, Train> trains= new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();
    public void addStations(Station station)
    {
        stations.put(station.getStationName(),station);
    }
    public void addTrain(Train train)
    {
       trains.put(train.getTrainID(),train);
    }
    public void addSchedule(Schedule schedule)
    {
        schedules.add(schedule);
    }
    public List<Schedule> findMyTrains(String startstationname, String endstationname)
    {
        List<Schedule> res= new ArrayList<>();
        for(Schedule schedule:schedules)
        {
            if(schedule.getStation().getStationName().equals(startstationname) ||
                    schedule.getStation().getStationName().equals(endstationname)) //(short circuiting) here 'or' operator since if java gets teh first value right then add it won't check the second condition
                /*if (a | b)
It still means OR, but it doesn't short-circuit — it checks both sides always.

But in logical conditions, we always use ||. */
            {
                res.add(schedule);
            }

        }

         return res;
    }



}

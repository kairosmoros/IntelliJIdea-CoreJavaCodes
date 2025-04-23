package Project2UsingCoreJava;

import java.util.ArrayList;
import java.util.List;

public class Station
{
    private String stationId;
    private String stationName;
    private List<Platform> platformlist;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.platformlist=new ArrayList<>();//it doesn't matter can be outside of this constructor also no matter
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platform> getPlatformlist() {
        return platformlist;
    }

    public void setPlatformlist(List<Platform> platformlist) {
        this.platformlist = platformlist;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platformlist=" + platformlist +
                '}';
    }
}

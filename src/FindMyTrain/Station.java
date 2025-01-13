package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {

    private String stationId;

    private String stationName;

    private List<Platform> PlatformList;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.PlatformList = new ArrayList<>();
    }

    //to access the Object outside use Getter and setter

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

    public List<Platform> getPlatformList() {
        return PlatformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        PlatformList = platformList;
    }

    //print the Object
    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", PlatformList=" + PlatformList +
                '}';
    }
}

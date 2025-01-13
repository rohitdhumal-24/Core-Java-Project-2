package FindMyTrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    private Map<String,Station> stations = new HashMap<>();

    private Map<String,Train> trains = new HashMap<>();

    private List<Schedule> schedules = new ArrayList<>();

    // Adding the Station in ---> stations
    public void addStations(Station station){
        stations.put(station.getStationId(),station);
    }

    // Adding the Train
    public void addTrains(Train train){
        trains.put(train.getTrainID(),train);
    }

    //adding the Schedule
    public void addSchedules(Schedule schedule){
        schedules.add(schedule); // Accept schedule from the user and added to the List.
    }

    public List<Schedule> findMyTrains(String startStationName,String endStationName){
        List<Schedule> result = new ArrayList<>();
        for(Schedule schedule : schedules){
            if(schedule.getStation().getStationName().equals(startStationName) ||
                    schedule.getStation().getStationName().equals(endStationName)){
                result.add(schedule);
            }
        }
        return result;
    }
}

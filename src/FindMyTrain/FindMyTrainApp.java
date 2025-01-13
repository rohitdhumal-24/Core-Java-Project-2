package FindMyTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        // to access the service of TrainSystem create object
        TrainSystem system = new TrainSystem();

        //adding the Station
        Station station1 = new Station("S0033","PUNE");
        Station station2 = new Station("S0044","BANGLORE");

        //Creating the Platform
        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        //Adding the Train between trains
        Train train1 = new Train("TR01","Express-train","Express");
        Train train2 = new Train("TR02","Passenger-train","Passenger");

        //set train on platform
        p1.setTrain(train1);
        p2.setTrain(train2);

        //Creating the List Of the platform
        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        //add platform in Station
        station1.setPlatformList(platformList);

        //Creating The Schedule for the Trains
        Schedule s1 =new Schedule(train1,station1,p1,"9.00AM","9.10AM");

        Schedule s2 =new Schedule(train1,station2,p2,"11.00AM","11.10AM");

        //Adding all Object to Train System
        system.addStations(station1);
        system.addStations(station2);

        system.addTrains(train1);
        system.addTrains(train2);

        system.addSchedules(s1);
        system.addSchedules(s2);

        //lets find the Trains
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Source Station Name to find train : ");
        String source = sc.nextLine();
        System.out.println("Enter the Destination Station Name to find train : ");
        String destination = sc.nextLine();
        List<Schedule> myTrains = system.findMyTrains(source,destination);
        System.out.print("Yours trains Between "+source+" and "+destination+" is : ");
//        System.out.println(myTrains);
        if (myTrains.isEmpty()) {
            System.out.println("No trains available between " + source + " and " + destination + ".");
        } else {
            System.out.println("Trains available between " + source + " and " + destination + ":");
            for (Schedule schedule : myTrains) {
                System.out.println("Train: " + schedule.getTrain().getTrainName() +
                        " | Arrival at " + schedule.getStation().getStationName() +
                        ": " + schedule.getArrivalTime() +
                        " | Departure: " + schedule.getDepartureTime());
                }
            }

    }
}
//input output
/*Enter the Source Station name to find train :
S0033
Enter the Destination Station name to find train :
S0044
Yours trains Between S0033 and S0044 is : Schedule{train=Train{trainID='TR01', trainName='Express-train', type='Express'}, station=Station{stationId='S0033', stationName='PUNE', PlatformList=[Platform{platformNumber=1, train=Train{trainID='TR01', trainName='Express-train', type='Express'}}, Platform{platformNumber=2, train=Train{trainID='TR02', trainName='Passenger-train', type='Passenger'}}]}, platform=Platform{platformNumber=1, train=Train{trainID='TR01', trainName='Express-train', type='Express'}}, arrivalTime=9.00AM, departureTime=9.10AM}
Process finished with exit code 0*/
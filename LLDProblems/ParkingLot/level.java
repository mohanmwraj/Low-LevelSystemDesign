import VehicleTypes.vehicleType;

import java.util.ArrayList;
import java.util.List;

public class level {
    private final int floor;
    private final List<parkingSpot> parkingSpotList;

    public level(int floor, int numOfSpots) {
        this.floor = floor;
        parkingSpotList = new ArrayList<>();

        //Assign spots in ration of 50:40:10 for bikes, cars and trucks
        double spotForBikes = 0.50;
        double spotForCars = 0.40;

        int numBikes = (int)(numOfSpots * spotForBikes);
        int numCars = (int)(numOfSpots * spotForCars);

        for(int i = 1; i <= numBikes; ++i){
            parkingSpotList.add(new parkingSpot(i, vehicleType.MOTORCYCLE));
        }
    }
}

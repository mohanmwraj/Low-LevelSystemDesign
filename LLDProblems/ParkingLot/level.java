import VehicleTypes.Vehicle;
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

        for(int i = numBikes + 1; i <= numBikes + numCars; ++i){
            parkingSpotList.add(new parkingSpot(i, vehicleType.CAR));
        }

        for(int i = numBikes + numCars + 1; i <= numOfSpots; ++i){
            parkingSpotList.add(new parkingSpot(i, vehicleType.TRUCK));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle){
        for(parkingSpot spot: parkingSpotList){
            if(spot.isAvaialable() && spot.getVehicleType() == vehicle.getType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle){
        for(parkingSpot spot: parkingSpotList){
            if(!spot.isAvaialable() && spot.getParkedVehicle().equals(vehicle)){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }

    public void disPlayAvailability(){
        System.out.println("Level " + floor + " Availability:");
        for(parkingSpot spot: parkingSpotList){
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvaialable() ? "Available For" : "Ocuupied By ") + " " +spot.getVehicleType());
        }
    }
}

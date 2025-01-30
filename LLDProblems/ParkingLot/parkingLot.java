import VehicleTypes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class parkingLot {
    private static parkingLot instance;
    private final List<level> levels;

    private parkingLot() {
        this.levels = new ArrayList<>();
    }
    
    public static synchronized parkingLot getInstance(){
        if(instance == null){
            instance = new parkingLot();
        }

        return instance;
    }

    public void addLevel(level lev){
        levels.add(lev);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(level lev: levels){
            if(lev.parkVehicle(vehicle)){
                System.out.println("Vehicle Parked Successfully.");
                return true;
            }
        }
        System.out.println("Could not park vehicle.");
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle){
        for(level lev: levels){
            if(lev.unparkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }

    public void displayAvailability(){
        for(level lev: levels){
            lev.disPlayAvailability();
        }
    }
}

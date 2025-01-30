import VehicleTypes.Vehicle;
import VehicleTypes.vehicleType;

public class parkingSpot {
    private final int spotNumber;
    private final VehicleTypes.vehicleType typeOfVehicle;
    private Vehicle parkedVehicle;

    public parkingSpot(int spotNumber, vehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.typeOfVehicle = vehicleType;
    }

    public synchronized boolean isAvaialable(){
        return parkedVehicle == null;
    }

    public synchronized void parkVehicle(Vehicle vehicle){
        if(isAvaialable() && vehicle.getType() == typeOfVehicle){
            parkedVehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Invalid Vehicle Type or Spot Already occupied.");
        }
    }

    public synchronized void unparkVehicle(){
        parkedVehicle = null;
    }

    public vehicleType getVehicleType(){
        return typeOfVehicle;
    }

    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }

    public int getSpotNumber(){
        return spotNumber;
    }
}

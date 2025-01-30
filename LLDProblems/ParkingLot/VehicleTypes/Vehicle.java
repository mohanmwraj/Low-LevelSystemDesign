package VehicleTypes;

public abstract class Vehicle {
    protected String licensePlate;
    protected vehicleType type;

    public Vehicle(String licensePlate, vehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public vehicleType getType(){
        return this.type;
    }
}

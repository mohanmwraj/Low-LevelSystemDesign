import VehicleTypes.Car;
import VehicleTypes.Motrocycle;
import VehicleTypes.Truck;
import VehicleTypes.Vehicle;

public class parkingLotDemo {
    public static void main(String[] args) {
        parkingLot lot = parkingLot.getInstance();
        lot.addLevel(new level(1, 100));
        lot.addLevel(new level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motrocycle("M1234");

        lot.parkVehicle(car);
        lot.parkVehicle(truck);
        lot.parkVehicle(motorcycle);

        lot.displayAvailability();

        lot.unParkVehicle(motorcycle);
        lot.displayAvailability();
    }
}

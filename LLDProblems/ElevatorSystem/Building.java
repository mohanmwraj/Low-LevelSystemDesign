import java.util.List;

public class Building {
    List<floor> floorList;

    public Building(List<floor> floorList){
        this.floorList = floorList;
    }

    public void addFloors(floor newFloor){
        floorList.add(newFloor);
    }

    public void removeFloors(floor removeFloor){
        floorList.remove(removeFloor);
    }

    public List<floor> getAllFloorList(){
        return floorList;
    }
}

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<floor> floorList = new ArrayList<>();
        floor floor1 = new floor(1);
        floor floor2 = new floor(2);
        floor floor3 = new floor(3);
        floor floor4 = new floor(4);
        floor floor5 = new floor(5);

        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);
        Building building = new Building(floorList);
    }
}

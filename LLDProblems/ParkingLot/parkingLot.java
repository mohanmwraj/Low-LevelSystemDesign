import java.util.List;

public class parkingLot {
    private static parkingLot instance;
    private final List<level> levels;

    public parkingLot(List<level> levels) {
        this.levels = levels;
    }
}

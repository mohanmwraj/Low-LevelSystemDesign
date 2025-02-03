public class floor {
    int floorNumber;
    ExternalDispatcher  externalDispatcher;

    public floor(int floorNumber) {
        this.floorNumber = floorNumber;
        externalDispatcher = new ExternalDispatcher();
    }

    public void pressButton(Direction direction){
        externalDispatcher.submitExternalRequest(floorNumber, direction);
    }
}

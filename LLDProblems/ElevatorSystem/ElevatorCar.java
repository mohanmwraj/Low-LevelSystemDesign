public class ElevatorCar {

    int id;
    ElevatorDisplay elevatorDisplay;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        elevatorDisplay = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }

    public void showDisplay(){
        elevatorDisplay.showDisplay();
    }

    public void pressButton(int destination){
        internalButtons.pressButton(destination, this);
    }

    public void setElevatorDisplay(){
        this.elevatorDisplay.setDisplay(currentFloor, elevatorDirection);
    }

    public boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.UP){
            for(int i = startFloor; i <= destinationFloor; ++i){
                this.currentFloor = startFloor;
                setElevatorDisplay();
                showDisplay();
                if(i == destinationFloor) return true;
            }
        }

        if(dir == Direction.DOWN){
            for(int i = startFloor; i >= destinationFloor; --i){
                this.currentFloor = startFloor;
                setElevatorDisplay();
                showDisplay();
                if(i == destinationFloor){
                    return true;
                }
            }
        }

        return false;
    }
}

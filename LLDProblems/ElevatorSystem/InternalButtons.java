public class InternalButtons {
    InternalDispatcher dispatcher = new InternalDispatcher();
    int[] availableButtons = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
    int buttonSelected;

    public void pressButton(int destination, ElevatorCar elevatorCar){

        //1. Check if destinaiton is in the list of available floors
        //2. Submit the request to the jobDispatcher

        dispatcher.submitInternalRequest(destination, elevatorCar);
    }
}

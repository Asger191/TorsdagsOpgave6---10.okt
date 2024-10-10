package Task3;
import java.util.ArrayList;

public class Building {
private ArrayList<Room> rooms;


private int numberOfFloors;


Building(int numberOfFloors,ArrayList<Room> rooms ) {

    this.numberOfFloors = numberOfFloors;
    this.rooms = rooms;

}

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
    return rooms;
    }

}

package Task3;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(2,4);
        Room room2 = new Room(4,2);
        Room room3 = new Room(3,5);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(3, rooms);

        System.out.println(countLampsInBuilding(building));
        System.out.println(countWindowsInBuilding(building));
        System.out.println(countRoomsInBuilding(building));

    }

    public static int countLampsInBuilding(Building building) {
        int lampCount = 0;
        for (Room s : building.getRooms()) {
            lampCount += s.getNumberOfLamps();

        }
        return lampCount;
    }
        public static int countWindowsInBuilding(Building building) {
            int windowCount = 0;
            for(Room s : building.getRooms()){
                windowCount += s.getNumberOfWindows();

            }
            return windowCount;
    }
    public static int countRoomsInBuilding(Building building) {

        return building.getRooms().size();
        }



    public static boolean  isNormal (Building building){
    if(building.getNumberOfFloors()>building.getRooms().size()) {
        return true;
    }
                else{
                    return false;
        }
    }


    }




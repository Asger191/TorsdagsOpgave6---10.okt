package Task3;

public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows) {

        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
}
    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }
void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
}
    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }



}

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private RoomType roomType;
    private String roomName;

    public ConferenceRoom(ArrayList<Guest> guests, int capacity, RoomType roomType, String roomName) {
        super(guests, capacity);
        this.roomType = roomType;
        this.roomName = roomName;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public String getRoomName() {
        return roomName;
    }
}

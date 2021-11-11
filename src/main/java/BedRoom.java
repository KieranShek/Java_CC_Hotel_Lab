import java.util.ArrayList;

public class BedRoom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public BedRoom(ArrayList<Guest> guests, RoomType roomType, int roomNumber) {
        super(guests, roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }


}

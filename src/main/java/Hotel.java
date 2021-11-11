import java.util.ArrayList;

public class Hotel{

    private  String name;
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<BedRoom> bedRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.bedRooms = bedRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkInGuest(Guest guest, Room room){
        room.checkInGuest(guest);
    }
}

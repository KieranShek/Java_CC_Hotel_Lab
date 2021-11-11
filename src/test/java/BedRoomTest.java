import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {


    BedRoom bedRoom;

    @Before
    public void before(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        Guest guest = new Guest("Steve");
        guests.add(guest);
        bedRoom = new BedRoom(guests,RoomType.DOUBLE, 2);
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedRoom.getRoomType());
    }

    @Test
    public void hasRoomNumber(){assertEquals(2, bedRoom.getRoomNumber());}




}

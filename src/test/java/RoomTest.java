import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private BedRoom bedroom;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before(){
        guest1 = new Guest("Craig");
        guest2 = new Guest("Jen");
        guests = new ArrayList<>();
        bedroom = new BedRoom(guests, RoomType.DOUBLE, 2);
    }

    @Test
    public void canAddGuest(){
        bedroom.checkInGuest(guest1);

        assertEquals(1, bedroom.getGuestCount());
    }

}
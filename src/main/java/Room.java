import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(ArrayList<Guest> guests, int capacity) {
        this.guests = guests;
        this.capacity = capacity;

    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public String checkInGuest(Guest guest) {
        if (this.getGuestCount() < this.getCapacity()) {
            guests.add(guest);
        } else {
            return "full";
        }
        return "checked in";
    }

    public String checkOutGuest(Guest guest) {
        if (this.getGuestCount() > 0) {
            guests.remove(guest);
        } else {
            return "empty";
        }
        return "checked out";
    }

}

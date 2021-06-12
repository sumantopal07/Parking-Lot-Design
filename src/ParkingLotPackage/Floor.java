package ParkingLotPackage;

import java.util.List;

public class Floor {
    private List<Slot> slots;
    Floor(){
    }

    public Floor(List<Slot> slots) {
        this.slots=slots;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }



    @Override
    public String toString() {
        return "Floor{" +
                "slots=" + slots +
                '}';
    }
}

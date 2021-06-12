package ParkingLotPackage;

public class Ticket {
    private String id;
    private Floor floor;
    private Slot slot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    Ticket create(Floor floor,Slot slot,Vehicle vehicle){
        return new Ticket();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", floor=" + floor +
                ", slot=" + slot +
                '}';
    }
}

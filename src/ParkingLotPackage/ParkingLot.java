package ParkingLotPackage;

import enums.DisplayType;
import enums.VehicleType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<Floor> floors;
    private String name;
    private Map<Ticket,Vehicle> tickets;

    public String getName() {
        return name;
    }
    public ParkingLot(){
    }

    public ParkingLot(String name,int floors,int slotPerFloor){
        this.tickets=new HashMap<>();
        this.name=name;
        Slot slot1=new Slot(VehicleType.TRUCK);
        Slot slot2=new Slot(VehicleType.BIKE);
        Slot slot3=new Slot(VehicleType.CAR);
        Slot slot4=new Slot(VehicleType.CAR);
        Slot slot5=new Slot(VehicleType.CAR);
        Slot slot6=new Slot(VehicleType.CAR);
        Slot slot7=new Slot(VehicleType.TRUCK);
        Slot slot8=new Slot(VehicleType.BIKE);
        Slot slot9=new Slot(VehicleType.CAR);
        Slot slot10=new Slot(VehicleType.CAR);
        Slot slot11=new Slot(VehicleType.CAR);
        Slot slot12=new Slot(VehicleType.CAR);
        Floor floor1=new Floor(List.of(slot1,slot2,slot3,slot4,slot5,slot6));
        Floor floor2=new Floor(List.of(slot7,slot8,slot9,slot10,slot11,slot12));
        this.floors=List.of(floor1,floor2);
    }
    @Override
    public String toString() {
        return "ParkingLot{" +
                "floors=" + floors +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public Ticket park(Vehicle vehicle){
        for(Floor floor:floors){
            for(Slot slot: floor.getSlots()){
                if(slot.getVehicleType()==vehicle.getVehicleType() && !slot.isOccupied()){
                    slot.setOccupied(true);
                    Ticket ticket=new Ticket();
                    ticket.setFloor(floor);
                    ticket.setSlot(slot);
                    ticket.setId(this.name+vehicle+slot+floor);

                    this.tickets.put(ticket,vehicle);
                    return ticket;
                }
            }
        }
        return null;
    }

    public boolean unPark(Ticket ticket){
        if(tickets.containsKey(ticket)){
            ticket.getSlot().setOccupied(false);
            tickets.remove(ticket);
            return true;
        }
        return false;
    }

    public void DisplayStatus(DisplayType displayType, VehicleType vehicleType){

        switch (displayType){

            case FREE_COUNT -> {
                for(Floor floor:floors){
                    int count=0;
                    for(Slot slot:floor.getSlots()){
                        if(slot.getVehicleType()==vehicleType && !slot.isOccupied()){
                            count++;
                        }
                    }
                    System.out.println(" Floor with "+vehicleType+" has "+count+" free slots");
                }

            }
            case FREE_SLOTS -> {
                for(Floor floor:floors){
                    for(Slot slot:floor.getSlots()){
                        if(slot.getVehicleType()==vehicleType && !slot.isOccupied()){
                            System.out.println("Floor with "+vehicleType+" has "+ slot+ " free");
                        }
                    }
                }
            }
            case OCCUPIED_SLOTS -> {
                for(Floor floor:floors){
                    for(Slot slot:floor.getSlots()){
                        if(slot.getVehicleType()==vehicleType && slot.isOccupied()){
                            System.out.println("Floor with "+vehicleType+" has "+ slot+ " occupied");
                        }
                    }
                }
            }

            default -> throw new IllegalStateException("Unexpected value: " + displayType);
        }

    }

}

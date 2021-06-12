package ParkingLotPackage;

import enums.VehicleType;

public class Slot {
    private boolean occupied;
    private VehicleType vehicleType;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    Slot(){
        occupied=false;
    }

    Slot(VehicleType vehicleType){
        this.vehicleType=vehicleType;
    }



    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Slot{" +
                ", occupied=" + occupied +
                ", vehicleType=" + vehicleType +
                '}';
    }
}

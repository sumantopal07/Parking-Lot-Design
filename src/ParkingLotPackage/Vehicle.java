package ParkingLotPackage;

import enums.VehicleType;

public class Vehicle {
    private VehicleType vehicleType;
    private String regNumber;
    private String Color;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", regNumber='" + regNumber + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}

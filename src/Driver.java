import ParkingLotPackage.ParkingLot;
import ParkingLotPackage.Ticket;
import ParkingLotPackage.Vehicle;
import enums.DisplayType;
import enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        //Default Parking lot
        ParkingLot parkingLot=new ParkingLot("PR1234",2,6);

        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.CAR);
        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.BIKE);
        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.TRUCK);

        parkingLot.DisplayStatus(DisplayType.FREE_SLOTS,VehicleType.CAR);
        parkingLot.DisplayStatus(DisplayType.FREE_SLOTS,VehicleType.BIKE);
        parkingLot.DisplayStatus(DisplayType.FREE_SLOTS,VehicleType.TRUCK);

        parkingLot.DisplayStatus(DisplayType.OCCUPIED_SLOTS,VehicleType.CAR);
        parkingLot.DisplayStatus(DisplayType.OCCUPIED_SLOTS,VehicleType.BIKE);
        parkingLot.DisplayStatus(DisplayType.OCCUPIED_SLOTS,VehicleType.TRUCK);


        Vehicle vehicle1=new Vehicle();
        vehicle1.setVehicleType(VehicleType.CAR);
        vehicle1.setColor("black");
        vehicle1.setRegNumber("KA-01-DB-1234");


        Vehicle vehicle2=new Vehicle();
        vehicle2.setVehicleType(VehicleType.CAR);
        vehicle2.setColor("red");
        vehicle2.setRegNumber("KA-01-DB-1334");

        Vehicle vehicle3=new Vehicle();
        vehicle3.setVehicleType(VehicleType.CAR);
        vehicle3.setColor("red");
        vehicle3.setRegNumber("KA-01-DB-1111");

        Vehicle vehicle4=new Vehicle();
        vehicle4.setVehicleType(VehicleType.CAR);
        vehicle4.setColor("black");
        vehicle4.setRegNumber("KA-01-DB-1991");

        Vehicle vehicle5=new Vehicle();
        vehicle5.setVehicleType(VehicleType.CAR);
        vehicle5.setColor("white");
        vehicle5.setRegNumber("KA-01-DB-1751");

        Vehicle vehicle6=new Vehicle();
        vehicle6.setVehicleType(VehicleType.CAR);
        vehicle6.setColor("black");
        vehicle6.setRegNumber("KA-01-DB-1001");

        Vehicle vehicle7=new Vehicle();
        vehicle7.setVehicleType(VehicleType.CAR);
        vehicle7.setColor("red");
        vehicle7.setRegNumber("KA-01-DB-2222");


        List<Ticket> ticket=new ArrayList<>();
        for(Vehicle vehicle: List.of(vehicle1,vehicle2,vehicle3,vehicle4,vehicle5,vehicle6,vehicle7)){
            var temp=parkingLot.park(vehicle);
            ticket.add(temp);
            System.out.println(temp != null ? "Parked Successfully" + vehicle : "Parked UnSuccessfully" + vehicle);
        }

        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.CAR);
        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.BIKE);
        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.TRUCK);

        parkingLot.unPark(ticket.get(0));
        parkingLot.unPark(ticket.get(5));
        parkingLot.unPark(ticket.get(6));
        System.out.println("\n============================================\n");

        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.CAR);
        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.BIKE);
        parkingLot.DisplayStatus(DisplayType.FREE_COUNT,VehicleType.TRUCK);

    }
}


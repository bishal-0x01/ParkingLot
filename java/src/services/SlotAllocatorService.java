package services;
import java.io.*;
import java.util.*;
import constants.*;
import entities.*;



public class SlotAllocatorService{

	public ParkingSpot findSpot(Vehicle vehicle){
		VehicleType vehicleType = vehicle.getVehicleType();
		ParkingLot parkingLot = ParkingLot.getInstance();
		List<Floors> floors = parkingLot.getFloors();

		for(Floors floor : floors){
			List<ParkingSpot> spots = floor.getParkingSpotList();

			for(ParkingSpot spot : spots){
				if(!spot.isOccupied() && isSpotSuitable(spot.getSpotType(), vehicleType)){
					return spot;
				}
			}
		}

		return null;

	}

	private boolean isSpotSuitable(SpotType spotType, VehicleType vehicleType) {
        return switch (vehicleType) {
            case BIKE -> spotType == SpotType.SMALL; // Motorcycles can park in any spot
            case CAR -> spotType == SpotType.MEDIUM;
            case TRUCK -> spotType == SpotType.LARGE;
            default -> false;
        };
	}

}
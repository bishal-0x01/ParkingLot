package services;
import java.io.*;
import java.util.*;
import constants.*;
import entities.*;



public class SlotAllocatorService{

	public ParkingSpot findSpot(VehicleType vehicleType){
		ParkingLot parkingLot = ParkingLot.getInstance();
		List<Floors> floors = parkingLot.getFloors();

		for(Floors floor : floors){
			
		}

	} 

}
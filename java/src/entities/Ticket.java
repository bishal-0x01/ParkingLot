package entities;
import java.io.*;
import java.util.*;
import constants.*;



public class Ticket{
	private int id;
	private int vehicleId;
	private String entryTime;
	private String exitTime;
	private ParkingSpot parkingSpot;

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		return this.id = id;
	}

	public int getVehicleId(){
		return this.vehicleId;
	}

	public void setVehicleId(int id){
		this.vehicleId = id;
	}

	public String getEntryTime(){
		return this.entryTime;
	}

	public void setEntryTime(String time){
		this.entryTime = time;
	}

	public String getExitTime(){
		return this.exitTime;
	}

	public void setExitTime(String time){
		this.exitTime = time;
	}

	public ParkingSpot getParkingSpot(){
		return this.parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot){
		this.parkingSpot = parkingSpot;
	}


}
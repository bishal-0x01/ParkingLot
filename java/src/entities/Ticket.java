package entities;
import java.io.*;
import java.util.*;
import constants.*;



public class Ticket{
	private int id;
	private Vehicle vehicle;
	private Date entryTime;
	private Date exitTime;
	private ParkingSpot parkingSpot;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Date getExitTime() {
		return exitTime;
	}

	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}



	public ParkingSpot getParkingSpot(){
		return this.parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot){
		this.parkingSpot = parkingSpot;
	}


}
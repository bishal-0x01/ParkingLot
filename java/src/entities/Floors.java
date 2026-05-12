
package entities;
import java.util.*;
import java.io.*;


public class Floors{
	private int id;
	private List<ParkingSpot> parkingSpots;
	private boolean fullyOccupied;

	public int getId(){
		return this.id;
	}

	public boolean isFullyOccupied(){
		return this.fullyOccupied;
	}

	public List<ParkingSpot> getParkingSpotList(){
		return this.parkingSpots;
	}

	public void setParkingSpotList(List<ParkingSpot> parkingSpots){
		this.parkingSpots = parkingSpots;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setFullyOccupied(boolean isOccupied){
		this.fullyOccupied = isOccupied;
	}
}
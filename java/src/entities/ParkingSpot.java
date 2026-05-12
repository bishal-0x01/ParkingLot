
package entities;
import java.util.*;
import java.io.*;
import constants.*;


public class ParkingSpot{
	private int id;
	private int floorId;
	private SpotType spotType;
	private boolean occupied;

	public int getId(){
		return this.id;
	}

	public boolean isOccupied(){
		return this.occupied;
	}

	public SpotType getSpotType(){
		return this.spotType;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setOccupied(boolean isOccupied){
		this.occupied = isOccupied;
	}

	public void setSpotType(SpotType spotType){
		this.spotType = spotType;
	}
}
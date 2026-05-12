package entities;
import java.io.*;
import java.util.*;
import constants.*;



public class Vehicle{
	private int id;
	private VehicleType vehicleType;

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		return this.id = id;
	}

	public VehicleType getVehicleType(){
		return this.vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType){
		this.vehicleType = vehicleType;
	}
}
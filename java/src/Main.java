

import java.io.*;
import java.util.*;
import entities.*;
import constants.*;



public class Main{

	public static void main(String [] args) throws Exception{
		System.out.println("Hello World!!!");

		Floors floor = new Floors();
		floor.setId(1);
		floor.setFullyOccupied(true);

		System.out.println(floor.getId());

		ParkingSpot spot = new ParkingSpot();

		spot.setSpotType(SpotType.MEDIUM);

		System.out.println(spot.getSpotType().toString());

	}
}

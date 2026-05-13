

import java.io.*;
import java.util.*;
import entities.*;
import constants.*;
import services.EntryGateService;
import services.ExitGateService;


public class Main{

	public static void main(String [] args) throws Exception{
		System.out.println("Hello World!!!");

		ParkingLot.getInstance().init(3, 10, 20, 5);
		Vehicle car = new Vehicle();
		car.setId(1);
		car.setVehicleType(VehicleType.CAR);

		EntryGateService entry = new EntryGateService();
		Ticket ticket = entry.generateTicket(car);

		ExitGateService exit = new ExitGateService();
		String result = exit.freeSpot(ticket, FeeStrategyEnum.HOUR);
		System.out.println(result);

	}
}

package services;
import entities.*;

import java.io.*;
import java.util.*;

public class EntryGateService {

    SlotAllocatorService slotAllocatorService = new SlotAllocatorService();

    public Ticket generateTicket(Vehicle vehicle){
        ParkingSpot spot = slotAllocatorService.findSpot(vehicle);

        if(spot == null) return null;

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        spot.setOccupied(true);
        ticket.setParkingSpot(spot);
        return ticket;
    }
}

package services;
import entities.*;

import java.io.*;
import java.util.*;

public class ExitGateService {

    public String freeSpot(Ticket ticket){
        ParkingSpot spot = ticket.getParkingSpot();
        spot.setOccupied(false);
        return "";
    }
}
